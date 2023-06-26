
package com.naveenautomationlabs.AutomationFramework;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.testng.internal.Utils;

import com.naveenautomationlabs.AutomationFramework.Pages1.AccountLogin;
import com.naveenautomationlabs.AutomationFramework.Pages1.ForgotYourPassword;
import com.naveenautomationlabs.AutomationFramework.Pages1.YourStore;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;



@Test
public class AccountLoginTest extends TestBase {

	YourStore yourStore;
	AccountLogin accountLogin;
	ForgotYourPassword forgotYourPassword;


	@BeforeMethod
	public void setUp() {
		// Utils.takeScreenShots();
		// Utils.takeScreenShot();
		initialisation();
		yourStore = new YourStore();
	}

	public void validateLoginUsingValidCredentials() {
		// Utils.takeScreenShot();
		yourStore.clickMyAccountBtn();
		accountLogin = yourStore.clickLoginBtn();
		forgotYourPassword = accountLogin.clickForgotPassword();
		forgotYourPassword.enterEmail();
		forgotYourPassword.clickContinueBtn();
		Assert.assertEquals(accountLogin.getPasswordResetLinkSuccessMessageText(),
				"An email with a confirmation link has been sent your email address.");
	}

	@AfterMethod
	public void quit() {
		tearDown();
	}
}
