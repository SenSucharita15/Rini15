package com.naveenautomationlabs.AutomationFramework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.Pages1.AccountLogin;
import com.naveenautomationlabs.AutomationFramework.Pages1.MyAccount;
import com.naveenautomationlabs.AutomationFramework.Pages1.ShoppingCart;
import com.naveenautomationlabs.AutomationFramework.Pages1.WishList;
import com.naveenautomationlabs.AutomationFramework.Pages1.YourStore;
import com.naveenautomationlabs.AutomationFramework.Pages1.iphonePage;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class YourStoreTest extends TestBase {

	YourStore yourStore;
	AccountLogin accountLogin;
	MyAccount myAccount;
	iphonePage iphone;
	ShoppingCart shoppingpage;
	WishList wishlist;

	@BeforeMethod
	public void setUp() {
		initialisation();
		accountLogin = new AccountLogin();
		yourStore = new YourStore();
		iphone = new iphonePage();
		shoppingpage = new ShoppingCart();
		wishlist = new WishList();
		myAccount = new MyAccount();
	}

	@Test(enabled = false)
	public void validateLoginUsingValidCredentials() {
		yourStore.clickMyAccountBtn();
		accountLogin = yourStore.clickLoginBtn();
		myAccount = accountLogin.loginToPortal();
		Assert.assertEquals(myAccount.getMyAccountText(), "My Account");
	}

	@Test(enabled = false)
	public void validateSearchProduct() {
		// yourStore.searchProductAndValidate();
		// iphone.validateProductDetails();
		String productName = "Samsung Galaxy Tab 10.1";
		yourStore.searchAnyProductDetails(productName);
		yourStore.addToCartFunction();
		shoppingpage.validateProductAddedToTheCart();
		// yourStore.addToWishListFunction();
	}

	@Test
	

	public void validateAddToWishList() {
		String productName = "iPhone";
		yourStore.searchAnyProductDetails(productName);
		yourStore.addToWishListFunction();
		accountLogin = yourStore.clickLoginBtn();
		accountLogin.loginToPortal();
		myAccount.clickOnWishListButton();
		wishlist.validateProductAddedToTheCart();

	}

	@Test(enabled = false)

	public void vaidateMovingElement() {
		yourStore.testMovingDots();
	}

	@Test

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
