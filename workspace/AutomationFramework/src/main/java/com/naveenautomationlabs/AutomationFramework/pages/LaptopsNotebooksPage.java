package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class LaptopsNotebooksPage extends TestBase {

	public LaptopsNotebooksPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#content > div:nth-child(7) >div:nth-of-type(1) button:nth-of-type(1)>span ")
	WebElement addToCartbtn;

	public HPLP3065Page clickaddToCartbtn() {
		addToCartbtn.click();
		return new HPLP3065Page();
	}

}
