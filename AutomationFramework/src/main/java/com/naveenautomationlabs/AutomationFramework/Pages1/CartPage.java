package com.naveenautomationlabs.AutomationFramework.Pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class CartPage extends TestBase {
	WebDriverWait wait;

	public CartPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "cart-total")
	private WebElement cartTotal;

	@FindBy(css = "table.table td:nth-of-type(2)")
	private WebElement cartTotalProductName;


	public String getproductName() {
		wait = new WebDriverWait(wd, 10);
		wait.until(ExpectedConditions.visibilityOf(cartTotal));
		cartTotal.click();
		return cartTotalProductName.getText();
	}

	public String getCartTotal() {
		// cartTotal.click();
		// WebDriverWait wait=new WebDriverWait();
		wait = new WebDriverWait(wd, 10);
		try {
			wait.until(ExpectedConditions.visibilityOf(cartTotal));
			cartTotal.click();
			return cartTotal.getText();
		} catch (Exception e) {
			cartTotal = wd.findElement(By.id("cart-total"));
			return cartTotal.getText();
		}


	}

}
