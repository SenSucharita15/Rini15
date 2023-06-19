package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class HPLP3065Page extends TestBase {

	public HPLP3065Page() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#input-quantity")
	WebElement qtyInputText;

	@FindBy(css = "button[id='button-cart']")
	WebElement addToCartbtn;

	@FindBy(css = "#top-links > ul > li:nth-child(5) > a > span")
	WebElement checkoutbtn;

	public void qtyInputTextAddValue() {
		qtyInputText.sendKeys("1");
	}

	public void clickaddToCartbtn() {
		addToCartbtn.click();
	}

	public CheckoutPage clickcheckoutbtn() {
		checkoutbtn.click();
		return new CheckoutPage();
	}

}
