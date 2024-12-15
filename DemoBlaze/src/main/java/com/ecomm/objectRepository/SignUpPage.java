package com.ecomm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	@FindBy(id = "sign-username")
	private WebElement userName;
	
	@FindBy(id = "sign-password")
	private WebElement password;
	
	@FindBy(xpath = "(//button[text()='Sign up'])")
	private WebElement signUpButton;
	
	@FindBy(xpath = "(//button[text()='Close'])[2]")
	private WebElement closeButton;
	
	@FindBy(xpath = "(//span[text()='×'])[2]")
	private WebElement dismissButton;
	
	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the userName
	 */
	public WebElement getUserName() {
		return userName;
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return password;
	}

	/**
	 * @return the signUpButton
	 */
	public WebElement getSignUpButton() {
		return signUpButton;
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
