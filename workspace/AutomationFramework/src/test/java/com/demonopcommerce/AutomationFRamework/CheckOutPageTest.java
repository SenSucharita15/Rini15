package com.demonopcommerce.AutomationFRamework;

import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demonopcommerce.AutomationFramework.Pages.BuildYourComputer;
import com.demonopcommerce.AutomationFramework.Pages.CheckOutPage;
import com.demonopcommerce.AutomationFramework.Pages.ComputerPage;
import com.demonopcommerce.AutomationFramework.Pages.DesktopPage;
import com.demonopcommerce.AutomationFramework.Pages.LoginPage;
import com.demonopcommerce.AutomationFramework.Pages.RegisterPage;
import com.demonopcommerce.AutomationFramework.Pages.ShoppingCartPage;
import com.demonopcommerce.AutomationFramework.Pages.StorePage;
import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class CheckOutPageTest extends TestBase {

	StorePage storepage;
	DesktopPage desktop;
	BuildYourComputer buildyourcomputerpage;
	RegisterPage registerpage;
	LoginPage loginpage;
	ComputerPage computerpage;
	ShoppingCartPage shopping;
	CheckOutPage checkout;

	private String email1;
	private String password1;

	@BeforeMethod
	public void setUp() {
		initialisation();
		// yourStorePage = new YourStorePage();
		desktop = new DesktopPage();
		storepage = new StorePage();
		registerpage = new RegisterPage();
		// LoginPage =new loginpage();
		// loginpage = new LoginPage();
		computerpage = new ComputerPage();
		// buildyourcomputerpage = new BuildYourComputer();
		// shopping = new ShoppingCartPage();
		// checkout = new CheckOutPage();
	}

	@Test

	public void validateShoppingWithRegisterLogin() {

		email1 = UUID.randomUUID().toString() + "@Yahoo.com";
		password1 = UUID.randomUUID().toString();

		storepage.clickRegisterButton();
		registerpage.enterFirstName();
		registerpage.enterLastName();
		registerpage.enterEmail(email1);
		registerpage.enterPassword(password1);
		registerpage.enterCofirmPassword(password1);
		registerpage.clickRegisterBtn();
		registerpage.clickContinueBtn();

		loginpage = storepage.clickLoginButton();

		loginpage.enterEmail(email1);
		loginpage.enterPassword(password1);
		loginpage.clickLoginBtn();

		storepage.clickComputerButton();
		desktop = storepage.clickDesktopButton();

		// computerpage.clickDesktopButton();
		// computerpage.clickAddToCartButton();
		buildyourcomputerpage = desktop.clickAddToCartButton();

		buildyourcomputerpage.addHDD();
		buildyourcomputerpage.addProcessor();
		buildyourcomputerpage.addQuantity();
		buildyourcomputerpage.addRam();
		buildyourcomputerpage.checkOS();
		buildyourcomputerpage.checkSoftware();
		buildyourcomputerpage.addToCartBtn();
		// buildyourcomputerpage.clickCloseBtn();
		shopping = buildyourcomputerpage.clickShopppingBtn();

		// buildyourcomputerpage.clickShoppingCart();
		// buildyourcomputerpage.clickGoToCart();

		shopping.checkTermsAndServices();
		checkout = shopping.checkout();

		// checkout.addAddress();
		// checkout.clickcontinueWithAddressBtn();

		checkout.addCounty();
		// checkout.addPhoneNumber();
		// checkout.addProvince();
		checkout.addCity();

		checkout.addAddress();
		checkout.addZip();
		checkout.addPhoneNumber();
		checkout.clickContinue();
		// checkout.clickShippingType();
		// checkout.clickPaymentType();
		checkout.clickcontinueAfterShipping();
		checkout.clickcontinueAfterPayment();
		checkout.clickpaymentinforContinue();
		checkout.clickconfirmButtonFinal();
		String text1 = checkout.confirmationMessage();
		Assert.assertEquals(text1, "Your order has been successfully processed!", "Order message not displayed");
		System.out.println(text1);

		// storepage.clickComputerButton();
		// desktoppage=storepage.clickDesktopButton();
		// desktoppage.addToCartBtn();

	}

	@AfterMethod
	public void quit() {
		tearDown();
	}
}
