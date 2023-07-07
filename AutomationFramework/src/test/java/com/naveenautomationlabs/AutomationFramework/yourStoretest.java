package com.naveenautomationlabs.AutomationFramework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.Pages1.AccountLogin;
import com.naveenautomationlabs.AutomationFramework.Pages1.CartPage;
import com.naveenautomationlabs.AutomationFramework.Pages1.MyAccount;
import com.naveenautomationlabs.AutomationFramework.Pages1.MyWishList;
import com.naveenautomationlabs.AutomationFramework.Pages1.YourStore;
import com.naveenautomationlabs.AutomationFramework.Pages1.iphonePage;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class YourStoreTest extends TestBase {

	public YourStore yourStore;
	public AccountLogin accountLogin;
	public MyAccount myAccount;
	private iphonePage iphone;
	private CartPage shoppingpage;
	private MyWishList wishlist;

	@BeforeMethod
	public void setUp() {
		initialisation();
		accountLogin = new AccountLogin();
		yourStore = new YourStore();
		iphone = new iphonePage();
		shoppingpage = new CartPage();
		wishlist = new MyWishList();
		myAccount = new MyAccount();
	}

	@Test
	public void validateLoginUsingValidCredentials() {
		yourStore.clickMyAccountBtn();
		accountLogin = yourStore.clickloginbtn();
		myAccount = accountLogin.loginToPortal();
		Assert.assertEquals(myAccount.getMyAccountText(), "My Account");
	}

	@Test
	public void validateSearchProduct() {
		// yourStore.searchProductAndValidate();
		// iphone.validateProductDetails();
		yourStore.navigateToHomePage();

		String productName = "Samsung Galaxy Tab 10.1";
		yourStore.searchAnyProductDetails(productName);
		Assert.assertTrue(yourStore.issearchResultDisplayed(), "no results found");
		Assert.assertNotNull(productName, "no product");
		// Assert.assertNotNull(yourStore.getProductPrice(), "Product price is not
		// available");

	}

	

	@Test(enabled = false)

	public void vaidateMovingElement() {
		yourStore.testMovingDots();
	}

	@Test(enabled = false)

	public void testMovingDots() {
		yourStore.navigateToHomePage();
		int initialDotCount = yourStore.getMovingDots().findElements(By.tagName("span")).size();
		yourStore.clickNextButton();
		int newDotCount = yourStore.getMovingDots().findElements(By.tagName("span")).size();

		Assert.assertNotEquals(initialDotCount, newDotCount, "DOts did not move");

	}

	@Test(enabled = false)

	public void testFailure() {
		Assert.assertEquals("Munni", "Sheela");
	}

	@AfterMethod
	public void quit() {
		tearDown();
	}

}
