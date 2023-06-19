package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class YourStorePage extends TestBase {

	public YourStorePage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "nav#menu div:nth-of-type(2) li:nth-of-type(2).dropdown>a")
	WebElement laptopsAndNotebooksbtn;

	@FindBy(css = " #menu > div.collapse >ul>li:nth-of-type(2)>a")
	WebElement showAllLaptopsAndNotebooksbtn;

	public void clicklaptopsAndNotebooksbtn() {
		laptopsAndNotebooksbtn.click();
	}

	public LaptopsNotebooksPage clickshowAllLaptopsAndNotebooksbtn() {
		showAllLaptopsAndNotebooksbtn.click();
		return new LaptopsNotebooksPage();
	}
}

