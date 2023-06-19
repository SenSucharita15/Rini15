package com.demonopcommerce.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class ComputerPage extends TestBase {

	public ComputerPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "div.master-wrapper-page  div  div.block.block-category-navigation > div.listbox > ul > li.active.last > ul > li:nth-child(1) > a")
	WebElement desktopBtn;
	@FindBy(css = "div.products-wrapper>div>div>div:nth-of-type(1) div.add-info div.buttons>button.product-box-add-to-cart-button")
	WebElement addToCartBtn;

	public void clickDesktopButton() {
		desktopBtn.click();
	}

	public void clickAddToCartButton() {
		addToCartBtn.click();
	}
}

