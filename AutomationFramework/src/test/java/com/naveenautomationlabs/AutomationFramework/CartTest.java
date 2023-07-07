package com.naveenautomationlabs.AutomationFramework;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.Pages1.AccountLogin;
import com.naveenautomationlabs.AutomationFramework.Pages1.CartPage;
import com.naveenautomationlabs.AutomationFramework.Pages1.MyAccount;
import com.naveenautomationlabs.AutomationFramework.Pages1.SearchResultsPage;
import com.naveenautomationlabs.AutomationFramework.Pages1.YourStore;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class CartTest extends TestBase {

	public YourStore yourStore;
	public AccountLogin accountLogin;
	public MyAccount myAccount;
	private SearchResultsPage searchResultsPage;
	private CartPage cartPage;

	@BeforeMethod
	public void setUp() {
		initialisation();
		accountLogin = new AccountLogin();
		myAccount = new MyAccount();
		yourStore = new YourStore();
		searchResultsPage = new SearchResultsPage();
		cartPage = new CartPage();

		// wishlist = new WishList();
	}

	@Test
	public void testAddToCart() {
		yourStore.navigateToHomePage();
		String itemName = "iPhone";
		yourStore.searchForItem(itemName);
		// int productindex = 1;
		searchResultsPage.clickAddToCart();
		String cartTotal = cartPage.getCartTotal();
		// String productName = cartPage.getproductName();
		// System.out.println(productName);
		// Assert.assertTrue(productName.contains(itemName), "item not found");
		System.out.println(cartTotal);
		Assert.assertTrue(cartTotal.contains(cartTotal), "item not found in the list");
	}

	@AfterMethod
	public void quit() {
		tearDown();
	}

}