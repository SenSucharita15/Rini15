package com.demonopcommerce.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class DesktopPage extends TestBase {
	public DesktopPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "div.products-wrapper > div > div > div:nth-child(1) > div > div.details > div.add-info > div.buttons > button.button-2.product-box-add-to-cart-button")
	WebElement addToCartBtn;

	public BuildYourComputer clickAddToCartButton() {
		addToCartBtn.click();
		return new BuildYourComputer();
	}

}
