package com.naveenautomationlabs.AutomationFramework.Pages1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class ShoppingCart extends TestBase {
	
	public ShoppingCart() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "div.table-responsive")
	private WebElement productDetails;

	public void validateProductAddedToTheCart() 
	{
		String expectedProductName = "Samsung Galaxy Tab 10.1";
		String expectedProductPrice = "$241.99";

		Assert.assertTrue(productDetails.getText().contains(expectedProductName), "Product name not found");
		Assert.assertTrue(productDetails.getText().contains(expectedProductPrice), "Product price not found");

	}

}
