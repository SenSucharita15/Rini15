package com.naveenautomationlabs.AutomationFramework;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomationlabs.AutomationFramework.Pages1.AccountLogin;
import com.naveenautomationlabs.AutomationFramework.Pages1.MyAccount;
import com.naveenautomationlabs.AutomationFramework.Pages1.MyWishList;
import com.naveenautomationlabs.AutomationFramework.Pages1.MyWishList.MyWishListTable;
import com.naveenautomationlabs.AutomationFramework.Pages1.ProductItem;
import com.naveenautomationlabs.AutomationFramework.Pages1.YourStore;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class MyWishListTest extends TestBase {

	public YourStore yourStore;
	public MyWishList wishlist;
	public AccountLogin loginpg;
	public MyAccount myAccount;

	@BeforeMethod
	public void setUp() {
		initialisation();
		yourStore = new YourStore();
		yourStore.clickMyAccountBtn();
		loginpg = yourStore.clickloginbtn();
		myAccount = loginpg.loginToPortal();
		wishlist = myAccount.clickOnWishListButton();
	}

	@Test(enabled = false)
	public void validateLoginUsingValidCredentials() {
		yourStore.clickMyAccountBtn();
		loginpg = yourStore.clickloginbtn();
		myAccount = loginpg.loginToPortal();
		wishlist = myAccount.clickOnWishListButton();

		// Assert.assertEquals(myAccount.getMyAccountText(), "My Account");
	}

	@Test(enabled = true)
	public void validateAddToWishListTable() {
		int val = wishlist.getIndexOfColumn(MyWishListTable.PRODUCT_NAME);
		System.out.println("The index is" + val);
		WebElement element = wishlist.getCellElementFromTable(MyWishListTable.PRODUCT_NAME, "Product 15");
		System.out.println(element.getText());
	}

	@Test(enabled = false)
	public void validateAddToWishList() {
		yourStore.navigateToHomePage();


		// locate the product want to add to wishlist
		yourStore.searchProductAndValidate();
		ProductItem product = yourStore.getProductByName1("iPhone");
		String productName = product.getProductName();
		product.clickAddToWishList();


		Assert.assertTrue(yourStore.isSuccessMessageDisplayed(), "Success message not displayed");
		yourStore.clickWishListTotal();
		loginpg.enterEmail();
		loginpg.enterPassword();
		loginpg.clickLoginBtn();

		// WishListItem wishlistitem = wishlist.getProductByName(productName);

		// Assert.assertNotNull(wishlistitem, "Product not found in the wishlist");
	}

	@AfterMethod
	public void quit() {
		tearDown();
	}
}
