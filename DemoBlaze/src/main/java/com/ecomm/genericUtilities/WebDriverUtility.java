package com.ecomm.genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Kishan Kumar Gupta
 * 
 *         This consist of reusable webdriver method to perform webdriver action
 *         using selenium
 */

public class WebDriverUtility {

	public WebDriver driver;
	public WebDriverWait wait;
	public Actions actions;
	public Select select;

	/**
	 * This method will maximize the window
	 */

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	/**
	 * This method will minimize the window
	 */

	public void minimizeWindow() {
		driver.manage().window().minimize();
	}

	/**
	 * This method will make the window fullscreen
	 */

	public void fullScreen() {
		driver.manage().window().fullscreen();
	}

	/**
	 * This method will delete all the cookies
	 */

	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	/**
	 * This method will set the size of the window
	 * 
	 * @param driver
	 * @param width
	 * @param height
	 */
	public void setSizeOfWindow(WebDriver driver, int width, int height) {
		Dimension dimension = new Dimension(width, height);
		driver.manage().window().setSize(dimension);
	}
	
	/**
	 * This method will set the position of the window
	 * @param driver
	 * @param xAxis
	 * @param yAxis
	 */
	public void setPositionOfWindow(WebDriver driver, int xAxis, int yAxis)
	{
		Point point = new Point(xAxis, yAxis);
		driver.manage().window().setPosition(point);
	}

	/**
	 * This method will implicitly stop the execution for 20 seconds
	 */
	public void implicitWaitForSeconds() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	/**
	 * This method will implicitly stop the execution for 200 nonoSeconds
	 */

	public void implicitWaitForNanos() {
		driver.manage().timeouts().implicitlyWait(Duration.ofNanos(200));
	}

	/**
	 * This method will implicitly stop the execution for 200 milliSeconds
	 */

	public void implicitWaitForMillis() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
	}

	/**
	 * This method will implicitly stop the execution for 1 day
	 */

	public void implicitWaitForDays() {
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(1));
	}

	/**
	 * This method will implicitly stop the execution for 1 minute
	 */

	public void implicitWaitForMinutes() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	}

	/**
	 * This method will implicitly stop the execution for 1 hour
	 */

	public void implicitWaitForHours() {
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
	}

	/**
	 * This method will stop the test execution until the element is clickable
	 * 
	 * @param element
	 */

	public void explicitWaitForElementToBeClickable(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method will stop the test execution until the element is visoble on the
	 * screen
	 * 
	 * @param element
	 */

	public void explicitWaitForElementToBeVisible(WebElement element) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method will set the size of the window
	 * 
	 * @param width
	 * @param height
	 */

	public void setSizeOfWindow(int width, int height) {
		Dimension dimension = new Dimension(width, height);
		driver.manage().window().setSize(dimension);
	}

	/**
	 * This method will set the position of the window
	 * 
	 * @param xAxis
	 * @param yAxis
	 */

	public void setPositionOfWindow(int xAxis, int yAxis) {
		Point point = new Point(xAxis, yAxis);
		driver.manage().window().setPosition(point);
	}

	/**
	 * This method will select the options based on the index.
	 * 
	 * @param element
	 * @param index
	 */

	public void selectByIndex(WebElement element, int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * This method will select the options based on the value
	 * 
	 * @param element
	 * @param value
	 */

	public void selectByValue(WebElement element, String value) {
		select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * This method will select the options based on the visible text value
	 * 
	 * @param element
	 * @param text
	 */
	public void selectByVisibleText(WebElement element, String text) {
		select = new Select(element);
		select.selectByVisibleText(text);
	}

	/**
	 * This method will deselect the value based on its index
	 * 
	 * @param element
	 * @param index
	 */

	public void deSelectByIndex(WebElement element, int index) {
		select = new Select(element);
		select.deselectByIndex(index);
	}

	/**
	 * This method will deselect the value based on its value
	 * 
	 * @param element
	 * @param value
	 */

	public void deSelectByValue(WebElement element, String value) {
		select = new Select(element);
		select.deselectByValue(value);
	}

	/**
	 * This method will deselect the options based on its text
	 * 
	 * @param element
	 * @param text
	 */

	public void deSelectByVisibleText(WebElement element, String text) {
		select = new Select(element);
		select.deselectByVisibleText(text);
	}

	/**
	 * This method will deselect all the value from the field
	 * 
	 * @param element
	 * @param text
	 */

	public void deSelectAll(WebElement element, String text) {
		select = new Select(element);
		select.deselectAll();
	}

	/**
	 * This method will return value if the selected options is multi selected or
	 * not and based on it returns boolean value
	 * 
	 * @param element
	 */

	public void isMultiple(WebElement element) {
		select = new Select(element);
		select.isMultiple();
	}

	/**
	 * This method will perform right click action on the webpage
	 * 
	 */
	public void rightClick() {
		actions = new Actions(driver);
		actions.contextClick().perform();
	}

	/**
	 * This method will perform right click action on the specified elements
	 * 
	 * @param element
	 */
	public void rightClick(WebElement element) {
		actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	/**
	 * This method will perform double click action on the web page
	 */
	public void doubleClick() {
		actions = new Actions(driver);
		actions.doubleClick().perform();
	}

	/**
	 * This method will perform double click action on the specific web element
	 * 
	 * @param element
	 */
	public void doubleClick(WebElement element) {
		actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	/**
	 * This method will perform drag & drop action from source to target
	 * 
	 * @param source
	 * @param target
	 */
	public void dragAndDrop(WebElement source, WebElement target) {
		actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}

	/**
	 * This method will perfrom drag & drop action and move the element to the point
	 * specified
	 * 
	 * @param source
	 * @param x
	 * @param y
	 */
	public void dragAndDrop(WebElement source, int x, int y) {
		actions = new Actions(driver);
		actions.dragAndDropBy(source, x, y).perform();
	}

	/**
	 * This method will perform click and hold action on the webpage
	 */
	public void clickAndHold() {
		actions = new Actions(driver);
		actions.clickAndHold().perform();
	}

	/**
	 * This method will perform click and hold action over the WebElement
	 * 
	 * @param element
	 */
	public void clickAndHold(WebElement element) {
		actions = new Actions(driver);
		actions.clickAndHold(element).perform();
	}

	/**
	 * This method will move the mouse cursor over the specific x & y co-ordinates
	 * 
	 * @param x
	 * @param y
	 */
	public void moveByOffset(int x, int y) {
		actions = new Actions(driver);
		actions.moveByOffset(x, y).perform();
	}

	/**
	 * This method will move the mouse cursor over the specific element
	 * 
	 * @param element
	 */
	public void moveToElement(WebElement element) {
		actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	/**
	 * This method will move the mouse cursor over the specific element and over the
	 * x and y co ordinate
	 * 
	 * @param element
	 * @param x
	 * @param y
	 */
	public void moveToElement(WebElement element, int x, int y) {
		actions = new Actions(driver);
		actions.moveToElement(element, x, y).perform();
	}

	/**
	 * This method will perform mouse scroll action upto an specific element
	 * 
	 * @param element
	 */
	public void scrollToElement(WebElement element) {
		actions = new Actions(driver);
		actions.scrollToElement(element).perform();
	}

	/**
	 * This method will scroll the mouse over a specific point i.e. x and y co
	 * ordinates
	 * 
	 * @param x
	 * @param y
	 */
	public void scrollByAmount(int x, int y) {
		actions = new Actions(driver);
		actions.scrollByAmount(x, y).perform();
	}

	/**
	 * This method is used to perform chrome options
	 * 
	 * @return
	 */
	public ChromeOptions getOptions() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-extensions");
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		return options;
	}

	/**
	 * This method will perform movement of scroll down for 500 units
	 * 
	 * @param driver
	 */
	public void scrollDownActions(WebDriver driver) {
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("window.ScrollBy(0,500);", "");
	}

	/**
	 * This method will perform movement of scroll up for 500 units
	 * 
	 * @param driver
	 */
	public void scrollUpActions(WebDriver driver) {
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("window.ScrollBy(0,-500);", "");
	}

	/**
	 * This method will perform movement of scroll down until a particular web
	 * element
	 * 
	 * @param driver
	 * @param element
	 */
	public void scrollDownUntilElement(WebDriver driver, WebElement element) {
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("argument[0].scrollIntoView();", element);
	}
	
	/**
	 * This method will accept the alert popup
	 * 
	 * @param driver
	 */
	public void acceptAlertPopUp(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * This method will dismiss the alert popup
	 * 
	 * @param driver
	 */
	public void dismissAlertPopUp(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * This method will capture the text of alert popup and return to caller method
	 * 
	 * @param driver
	 * @return alertPopUpText
	 */
	public String getTextOfAlertPopUp(WebDriver driver) {
		String alertPopUpText = driver.switchTo().alert().getText();
		return alertPopUpText;
	}

	/**
	 * This method will send data into alert popup
	 * 
	 * @param driver
	 * @param text
	 */
	public void sendTextInAlertPopUp(WebDriver driver, String text) {
		driver.switchTo().alert().sendKeys(text);
	}

	/**
	 * This method will handle frame by using index
	 * 
	 * @param driver
	 * @param index
	 */
	public void handleFrameByIndex(WebDriver driver, int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}

	/**
	 * This method will handle frame by using name or Id
	 * 
	 * @param driver
	 * @param nameOrId
	 */
	public void handleFrameByNameOrId(WebDriver driver, String frameNameOrId) {
		driver.switchTo().frame(frameNameOrId);
	}

	/**
	 * This method will handle frame by using frameElement
	 * 
	 * @param driver
	 * @param frameElement
	 */
	public void handleFrameByElement(WebDriver driver, WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	/**
	 * This method will switch to immediate parent frame
	 * 
	 * @param driver
	 */
	public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}

	/**
	 * This method will switch to default or main page
	 * 
	 * @param driver
	 */
	public void switchToDefaultContentFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	/**
	 * This method will help to switch the control from one window to another window
	 * 
	 * @param driver
	 * @param partialWindowName
	 */
	public void switchToWindows(WebDriver driver, String partialWindowName) {
		Set<String> allWindowIDs = driver.getWindowHandles();

		for (String IDs : allWindowIDs) {
			String actualTitle = driver.switchTo().window(IDs).getTitle();

			if (actualTitle.contains(partialWindowName)) {
				break;
			}
		}
	}

	/**
	 * This method will take screenshot of the webpage and store it in the desired
	 * location
	 * 
	 * @throws IOException
	 */
	public void takesWebPageScreenShot() throws IOException {
		String date = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./DemoBlaze/screenshots" + date + ".png");
		org.openqa.selenium.io.FileHandler.copy(temp, dest);
	}

	/**
	 * This method will take screenshot of a web element and store it in specified
	 * filepath
	 * 
	 * @throws IOException
	 */
	public void takeWebElementScreenShot() throws IOException {
		String date = LocalDateTime.now().toString().replace(":", "-");
		WebElement element = driver.findElement(By.className(null));
		File temp = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("./DemoBlaze/screenshots" + date + ".png");
		FileHandler.copy(temp, dest);
	}
}
