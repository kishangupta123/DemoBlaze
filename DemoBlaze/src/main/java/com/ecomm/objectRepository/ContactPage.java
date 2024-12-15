package com.ecomm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	@FindBy(id = "recipient-email")
	private WebElement emailTextField;
	
	@FindBy(id = "recipient-name")
	private WebElement nameTextField;
	
	@FindBy(id = "message-text")
	private WebElement messageTextField;
	
	@FindBy(xpath = "//button[text()='Send message']")
	private WebElement sendButton;
	
	@FindBy(xpath = "(//button[text()='Close'])[1]")
	private WebElement cancelButton;
	
	@FindBy(xpath = "(//span[text()='×'])[1]")
	private WebElement dismissButton;
	
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the emailTextField
	 */
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	/**
	 * @return the nameTextField
	 */
	public WebElement getNameTextField() {
		return nameTextField;
	}

	/**
	 * @return the messageTextField
	 */
	public WebElement getMessageTextField() {
		return messageTextField;
	}

	/**
	 * @return the sendButton
	 */
	public WebElement getSendButton() {
		return sendButton;
	}

	/**
	 * @return the cancelButton
	 */
	public WebElement getCancelButton() {
		return cancelButton;
	}

	/**
	 * @return the dismissButton
	 */
	public WebElement getDismissButton() {
		return dismissButton;
	}
}
