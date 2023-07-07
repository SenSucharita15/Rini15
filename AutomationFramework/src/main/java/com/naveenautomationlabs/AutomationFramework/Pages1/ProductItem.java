package com.naveenautomationlabs.AutomationFramework.Pages1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class ProductItem extends TestBase {

	public ProductItem(WebElement element) {
		PageFactory.initElements(wd, this);

	}

	@FindBy(css = "h4")
	private WebElement productName;

	@FindBy(css = "button[onclick*='wishlist']")
	private WebElement addToWishlistButton;

	public String getProductName() {
		return productName.getText();

	}

	public void clickAddToWishList() {
		addToWishlistButton.click();
	}

}
