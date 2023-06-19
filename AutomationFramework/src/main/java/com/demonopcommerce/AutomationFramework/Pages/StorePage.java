package com.demonopcommerce.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class StorePage extends TestBase {

	public StorePage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = " div.header-links > ul > li:nth-child(2) > a")
	WebElement loginBtn;

	@FindBy(css = "div.header-links-wrapper > div.header-links > ul > li:nth-child(1) > a")
	WebElement registerBtn;

	@FindBy(css = "div.master-wrapper-page>div:nth-of-type(2)>ul.top-menu.notmobile>li:nth-of-type(1)>a")
	WebElement computerBtn;

	@FindBy(css = "div.master-wrapper-page div\r\n"
			+ "	 div.block.block-category-navigation > div.listbox > ul > li.active.last > ul\r\n"
			+ "	 > li:nth-child(1) > a")
	WebElement desktopBtn;

	// @FindBy(css = "div.products-wrapper>div>div>div:nth-of-type(1) div.add-info
	// div.buttons>button.product-box-add-to-cart-button")
	// WebElement addToCartBtn;

	public LoginPage clickLoginButton() {
		loginBtn.click();
		return new LoginPage();
	}

	public void clickRegisterButton() {
		registerBtn.click();
	}

	public void clickComputerButton() {
		computerBtn.click();
	}

	public DesktopPage clickDesktopButton() {
		desktopBtn.click();
		return new DesktopPage();
	}

//	public void clickAddToCartButton() {
//		addToCartBtn.click();
//	}

}
