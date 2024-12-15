package com.ecomm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	@FindBy(xpath = "//button[text()='Place Order']")
	private WebElement placeOrderButton;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the placeOrderButton
	 */
	public WebElement getPlaceOrderButton() {
		return placeOrderButton;
	}
}
