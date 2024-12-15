package com.ecomm.genericUtilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.ecomm.objectRepository.AboutUs;
import com.ecomm.objectRepository.AddToCart;
import com.ecomm.objectRepository.CartPage;
import com.ecomm.objectRepository.ContactPage;
import com.ecomm.objectRepository.HomePage;
import com.ecomm.objectRepository.LoginPage;
import com.ecomm.objectRepository.SignUpPage;

public class BaseClass {
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	public  ExtentTest stest;
	
	public WebDriver driver;
	public static WebDriver sdriver;
	
	public ExcelUtility eutils = new ExcelUtility();
	public FileUtility futils  = new FileUtility();
	public JavaUtility jutils  = new JavaUtility();
	public WebDriverUtility wutils = new WebDriverUtility();
	
	
	public AboutUs aboutUs;
	public AddToCart addToCart;
	public CartPage cartPage;
	public ContactPage contactPage;
	public HomePage homePage;
	public LoginPage loginPage;
	public SignUpPage signUpPage;
	
	@BeforeSuite
	public void reportConfiguration() 
	{
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./HTML_Reports/ExtenReport_" + jutils.getLocalDateTime() + ".html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter);
	}
	
	@Parameters("Browsers")
	@BeforeClass
	public void launchBrowser(@Optional("edge") String browserName) throws IOException 
	{
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else 
		{
			System.out.println("Invalid Browser");
		}
		driver.manage().window().maximize();
		sdriver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(futils.getStringDataFromProperty("url"));
	}
	
	@BeforeMethod
	public void signup() throws IOException {
		homePage   = new HomePage(driver);
		homePage.getSignupLink().click();
		
		signUpPage = new SignUpPage(driver);
		signUpPage.getUserName().sendKeys(futils.getStringDataFromProperty("username"));
		signUpPage.getPassword().sendKeys(futils.getStringDataFromProperty("password"));
		signUpPage.getSignUpButton().click();
	}
	
	@BeforeMethod(dependsOnMethods = "signup")
	public void setUp() throws IOException {
		loginPage = new LoginPage(driver);
		loginPage.getUsernameTextField().sendKeys(futils.getStringDataFromProperty("username"));
		loginPage.getPasswordTextField().sendKeys(futils.getStringDataFromProperty("password"));
		loginPage.getLoginButton().click();
	}
	
	@AfterMethod
	public void tearDown() {
		
	}
}
