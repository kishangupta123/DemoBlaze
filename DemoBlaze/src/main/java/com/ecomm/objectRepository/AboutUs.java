package com.ecomm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs {
	@FindBy(xpath = "(//span[text()='×'])[4]")
	private WebElement dismissButton;
	
	@FindBy(xpath = "(//span[text()='Play Video'])")
	private WebElement playButton;
	
	@FindBy(xpath = "(//button[text()='Close'])[4]")
	private WebElement closeButton;
	
	public AboutUs(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the dismissButton
	 */
	public WebElement getDismissButton() {
		return dismissButton;
	}

	/**
	 * @return the playButton
	 */
	public WebElement getPlayButton() {
		return playButton;
	}

	/**
	 * @return the closeButton
	 */
	public WebElement getCloseButton() {
		return closeButton;
	}
}
