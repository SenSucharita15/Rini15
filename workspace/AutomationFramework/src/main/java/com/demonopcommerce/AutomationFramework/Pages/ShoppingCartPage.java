package com.demonopcommerce.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class ShoppingCartPage extends TestBase {

	public ShoppingCartPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "button#checkout")
	WebElement checkoutBtn;

	@FindBy(css = "input#termsofservice")
	WebElement termsAndService;

	public void checkTermsAndServices() {
		termsAndService.click();
	}

	public CheckOutPage checkout() {
		checkoutBtn.click();
		return new CheckOutPage();
	}

}
