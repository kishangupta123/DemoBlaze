package com.ecomm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	@FindBy(xpath = "//a[contains(.,'Add to cart')]")
	private WebElement addToCartBTN;
	
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the addToCartBTN
	 */
	public WebElement getAddToCartBTN() {
		return addToCartBTN;
	}	
}
