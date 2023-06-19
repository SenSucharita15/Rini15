package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class YourorderhasbeenplacedPage extends TestBase {

	public YourorderhasbeenplacedPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#content > h1")
	WebElement confirmationText;

	public void validateConfirmationOfOrder() {
		String text = confirmationText.getText();
		Assert.assertEquals(text, "Your order has been placed!");
	}

}
