package com.naveenautomationlabs.AutomationFramework.Pages1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class MyAccount extends TestBase {

	public MyAccount() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#content>h2:first-of-type")
	WebElement myAccountText;

	@FindBy(css = "ul.list-inline>li:nth-of-type(3)")
	WebElement wishListButton;

	public String getMyAccountText() {
		return myAccountText.getText();
	}

	public MyWishList clickOnWishListButton() {
		wishListButton.click();
		return new MyWishList();
	}
}
