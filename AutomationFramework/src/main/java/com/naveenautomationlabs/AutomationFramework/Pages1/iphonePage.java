package com.naveenautomationlabs.AutomationFramework.Pages1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class iphonePage extends TestBase {

	public iphonePage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "div.product-layout")
	private WebElement searchResults;

	@FindBy(css = "div.product-layout .product-thumb h4 a")
	private WebElement productName;

	@FindBy(css = "div.product-layout .product-thumb p.price")
	private WebElement productPrice;

	public void validateProductDetails() {
		Assert.assertEquals(productName.getText(), "iPhone", "Product name doesnot match");
		Assert.assertTrue(productPrice.getText().contains("$"),
				"Product price does not match and contains currency symbol");
	}

}
