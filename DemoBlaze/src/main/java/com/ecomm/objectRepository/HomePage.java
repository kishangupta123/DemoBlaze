package com.ecomm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(partialLinkText = "Home")
	private WebElement homeLink;
	
	@FindBy(linkText = "Contact")
	private WebElement contactLink;
	
	@FindBy(linkText = "About us")
	private WebElement aboutLink;
	
	@FindBy(id = "cartur")
	private WebElement cartLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(linkText = "Sign up")
	private WebElement signupLink;
	
	@FindBy(xpath = "(//span[text()='Next'])")
	private WebElement nextIcon;
	
	@FindBy(xpath = "(//span[text()='Previous'])")
	private WebElement previousIcon;
	
	@FindBy(xpath = "//a[contains(.,'Phones')]")
	private WebElement phonesLink;
	
	@FindBy(xpath = "//a[contains(.,'Laptops')]")
	private WebElement laptopsLink;
	
	@FindBy(xpath = "//a[contains(.,'Monitors')]")
	private WebElement monitorsLink;
	
	@FindBy(xpath = "//a[contains(.,'Samsung galaxy s6')]")
	private WebElement samsungGalaxys6;
	
	@FindBy(xpath = "//a[contains(.,'Nokia lumia 1520')]")
	private WebElement nokiaLumia;
	
	@FindBy(xpath = "//a[contains(.,'Nexus 6')]")
	private WebElement nexus6;
	
	@FindBy(xpath = "//a[contains(.,'Samsung galaxy s7')]")
	private WebElement samsungGalaxys7;
	
	@FindBy(xpath = "//a[contains(.,'Iphone 6 32gb')]")
	private WebElement iPhone6;
	
	@FindBy(xpath = "//a[contains(.,'Sony xperia z5')]")
	private WebElement sonyXperia;
	
	@FindBy(xpath = "//a[contains(.,'HTC One M9')]")
	private WebElement htcOneM9;
	
	@FindBy(xpath = "//a[contains(.,'Sony vaio i5')]")
	private WebElement sonyVaioI5;
	
	@FindBy(xpath = "//a[contains(.,'Sony vaio i7')]")
	private WebElement sonyVaioI7;
	
	@FindBy(xpath = "//a[contains(.,'Apple monitor 24')]")
	private WebElement appleMonitor;
	
	@FindBy(xpath = "//a[contains(.,'MacBook air')]")
	private WebElement macAir;
	
	@FindBy(xpath = "//a[contains(.,'Dell i7 8gb')]")
	private WebElement dellI7;
	
	@FindBy(xpath = "//a[contains(.,'2017 Dell 15.6 Inch')]")
	private WebElement dellLaptop;
	
	@FindBy(xpath = "//a[contains(.,'ASUS Full HD')]")
	private WebElement asusFullHD;
	
	@FindBy(xpath = "//a[contains(.,'MacBook Pro')]")
	private WebElement macbookPro;
	
	@FindBy(id = "next2")
	private WebElement nextButton;
	
	@FindBy(id = "prev2")
	private WebElement previousButton;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the homeLink
	 */
	public WebElement getHomeLink() {
		return homeLink;
	}

	/**
	 * @return the contactLink
	 */
	public WebElement getContactLink() {
		return contactLink;
	}

	/**
	 * @return the aboutLink
	 */
	public WebElement getAboutLink() {
		return aboutLink;
	}

	/**
	 * @return the cartLink
	 */
	public WebElement getCartLink() {
		return cartLink;
	}

	/**
	 * @return the loginLink
	 */
	public WebElement getLoginLink() {
		return loginLink;
	}

	/**
	 * @return the signupLink
	 */
	public WebElement getSignupLink() {
		return signupLink;
	}

	/**
	 * @return the nextIcon
	 */
	public WebElement getNextIcon() {
		return nextIcon;
	}

	/**
	 * @return the previousIcon
	 */
	public WebElement getPreviousIcon() {
		return previousIcon;
	}

	/**
	 * @return the phonesLink
	 */
	public WebElement getPhonesLink() {
		return phonesLink;
	}

	/**
	 * @return the laptopsLink
	 */
	public WebElement getLaptopsLink() {
		return laptopsLink;
	}

	/**
	 * @return the monitorsLink
	 */
	public WebElement getMonitorsLink() {
		return monitorsLink;
	}

	/**
	 * @return the samsungGalaxys6
	 */
	public WebElement getSamsungGalaxys6() {
		return samsungGalaxys6;
	}

	/**
	 * @return the nokiaLumia
	 */
	public WebElement getNokiaLumia() {
		return nokiaLumia;
	}

	/**
	 * @return the nexus6
	 */
	public WebElement getNexus6() {
		return nexus6;
	}

	/**
	 * @return the samsungGalaxys7
	 */
	public WebElement getSamsungGalaxys7() {
		return samsungGalaxys7;
	}

	/**
	 * @return the iPhone6
	 */
	public WebElement getiPhone6() {
		return iPhone6;
	}

	/**
	 * @return the sonyXperia
	 */
	public WebElement getSonyXperia() {
		return sonyXperia;
	}

	/**
	 * @return the htcOneM9
	 */
	public WebElement getHtcOneM9() {
		return htcOneM9;
	}

	/**
	 * @return the sonyVaioI5
	 */
	public WebElement getSonyVaioI5() {
		return sonyVaioI5;
	}

	/**
	 * @return the sonyVaioI7
	 */
	public WebElement getSonyVaioI7() {
		return sonyVaioI7;
	}

	
	
	/**
	 * @return the appleMonitor
	 */
	public WebElement getAppleMonitor() {
		return appleMonitor;
	}

	/**
	 * @return the macAir
	 */
	public WebElement getMacAir() {
		return macAir;
	}

	/**
	 * @return the dellI7
	 */
	public WebElement getDellI7() {
		return dellI7;
	}

	/**
	 * @return the dellLaptop
	 */
	public WebElement getDellLaptop() {
		return dellLaptop;
	}

	/**
	 * @return the asusFullHD
	 */
	public WebElement getAsusFullHD() {
		return asusFullHD;
	}

	/**
	 * @return the macbookPro
	 */
	public WebElement getMacbookPro() {
		return macbookPro;
	}

	/**
	 * @return the nextButton
	 */
	public WebElement getNextButton() {
		return nextButton;
	}

	/**
	 * @return the previousButton
	 */
	public WebElement getPreviousButton() {
		return previousButton;
	}
}
