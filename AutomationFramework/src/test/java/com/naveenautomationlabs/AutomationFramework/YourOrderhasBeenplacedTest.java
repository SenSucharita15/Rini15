package com.naveenautomationlabs.AutomationFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;
import com.naveenautomationlabs.AutomationFramework.pages.CheckoutPage;
import com.naveenautomationlabs.AutomationFramework.pages.HPLP3065Page;
import com.naveenautomationlabs.AutomationFramework.pages.LaptopsNotebooksPage;
import com.naveenautomationlabs.AutomationFramework.pages.YourStorePage;

public class YourOrderhasBeenplacedTest extends TestBase {
	YourStorePage yourStorePage;
	LaptopsNotebooksPage laptopsNotebooksPage;
	HPLP3065Page hlp;
	CheckoutPage checkoutPage;

	@BeforeMethod
	public void setUp() {
		initialisation();
		yourStorePage = new YourStorePage();
	}

	@Test
	public void validate() {
		yourStorePage.clicklaptopsAndNotebooksbtn();
		laptopsNotebooksPage = yourStorePage.clickshowAllLaptopsAndNotebooksbtn();
		hlp = laptopsNotebooksPage.clickaddToCartbtn();
		hlp.qtyInputTextAddValue();
		hlp.clickaddToCartbtn();
		checkoutPage = hlp.clickcheckoutbtn();
		checkoutPage.clickregisterAccountbtn();
		checkoutPage.enterEmailIninputEMail();
		checkoutPage.enterPasswordIninputPassword();
		checkoutPage.checkExistingAddressText();

	}

	@AfterMethod
	public void quit() {
		tearDown();
	}

}
