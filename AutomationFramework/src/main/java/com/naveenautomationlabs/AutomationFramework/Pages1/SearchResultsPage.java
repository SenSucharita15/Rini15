package com.naveenautomationlabs.AutomationFramework.Pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class SearchResultsPage extends TestBase {

	public SearchResultsPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "div.product-layout")
	private WebElement productElement;

	public void clickAddToCart() {

		WebElement addToCartButton = productElement.findElement(By.cssSelector("button[onclick*='cart']"));
		// WebElement addToCartButton = wd.findElement(By.xpath(addToCartButtonXpath));
		addToCartButton.click();
	}

}
