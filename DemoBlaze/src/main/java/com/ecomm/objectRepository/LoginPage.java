package com.ecomm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "loginusername")
	private WebElement usernameTextField;
	
	@FindBy(id = "loginpassword")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginButton;
	
	@FindBy(xpath = "(//button[text()='Close'])[3]")
	private WebElement closeButton;
	
	@FindBy(xpath = "(//span[text()='×'])[3]")
	private WebElement dismissButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the usernameTextField
	 */
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	/**
	 * @return the passwordTextField
	 */
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return loginButton;
	}

	/**
	 * @return the closeButton
	 */
	public WebElement getCloseButton() {
		return closeButton;
	}

	/**
	 * @return the dismissButton
	 */
	public WebElement getDismissButton() {
		return dismissButton;
	}
}
