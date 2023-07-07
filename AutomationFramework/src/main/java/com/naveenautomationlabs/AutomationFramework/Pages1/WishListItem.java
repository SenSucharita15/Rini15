package com.naveenautomationlabs.AutomationFramework.Pages1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class WishListItem extends TestBase {
	private WebElement element;


	public WishListItem(WebElement element) {

		PageFactory.initElements(wd, this);
		this.element = element;

	}


	// public WishListItem
}

