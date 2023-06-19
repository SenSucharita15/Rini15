package com.demonopcommerce.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class BuildYourComputer extends TestBase {
	Select sc;

	public BuildYourComputer() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "select#product_attribute_1")
	WebElement processor;

	@FindBy(css = "select#product_attribute_2")
	WebElement ram;

	@FindBy(css = "input#product_attribute_3_6")
	WebElement hdd;

	@FindBy(css = "dd#product_attribute_input_4 > ul > li:nth-child(1) > label")
	WebElement OS;

	@FindBy(css = "dd#product_attribute_input_5 > ul > li:nth-child(1) > label")
	WebElement software;

	@FindBy(css = "input#product_enteredQuantity_1")
	WebElement quantity;

	@FindBy(css = "button#add-to-cart-button-1")
	WebElement addToCartBtn;

	@FindBy(css = "#bar-notification > div > p > a")
	WebElement shoppingButton;

	@FindBy(css = "#topcartlink > a > span.cart-label")
	WebElement shoppingCartBtn;

	@FindBy(css = "div#flyout-cart > div > div.buttons > button")
	WebElement goToCartBtn;

//	@FindBy(css = "button#checkout")
//	WebElement checkoutBtn;
//
//	@FindBy(css = "input#termsofservice")
//	WebElement termsAndService;
//
//	public void checkTermsAndServices() {
//		termsAndService.click();
//	}
//
//	public void checkout() {
//		checkoutBtn.click();
//	}

	public ShoppingCartPage clickShopppingBtn() {
		shoppingButton.click();
		return new ShoppingCartPage();
	}

	public void clickShoppingCart() {
		shoppingCartBtn.click();
	}

	public void clickGoToCart() {
		goToCartBtn.click();
	}

	public void addProcessor() {
		sc = new Select(processor);
		sc.selectByIndex(1);
	}

	public void addRam() {
		sc = new Select(ram);
		sc.selectByIndex(1);
	}

	public void addHDD() {
		hdd.click();
	}

	public void checkOS() {
		OS.click();
	}

	public void checkSoftware() {
		software.click();
	}

	public void addQuantity() {
		quantity.sendKeys("1");
	}

	public void addToCartBtn() {
		addToCartBtn.click();
	}

}
