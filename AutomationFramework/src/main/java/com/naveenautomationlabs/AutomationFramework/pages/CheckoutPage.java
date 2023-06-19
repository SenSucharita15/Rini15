package com.naveenautomationlabs.AutomationFramework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class CheckoutPage extends TestBase {
	Select sc;

	public CheckoutPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "#collapse-checkout-option > div>div>div:nth-of-type(1)")
	WebElement registerAccountbtn;

	@FindBy(css = "#input-email")
	WebElement inputEMail;

	@FindBy(css = "input[type=password]")
	WebElement inputPassword;

	@FindBy(css = "input#button-login")
	WebElement loginbtn;

	@FindBy(css = "input[name=firstname]")
	WebElement firstName;

	@FindBy(css = "input[name=lastname]")
	WebElement lastName;

	@FindBy(css = "input[name=company]")
	WebElement company;

	@FindBy(css = "input[name=address_1]")
	WebElement address1;

	@FindBy(css = "input[name=city]")
	WebElement city;

	@FindBy(css = "input[name=postcode]")
	WebElement postCode;

	@FindBy(css = "#input-payment-country")
	WebElement country;

	@FindBy(css = "   #input-payment-zone")
	WebElement regionOrState;

	@FindBy(css = "input#button-payment-address")
	WebElement continuebtn;

	@FindBy(css = "#accordion >div:nth-of-type(3)>div>h4>a ")
	WebElement deliverDetails;

	@FindBy(css = "input[value=existing][name=payment_address]")
	WebElement checkExistingAddressText;

	@FindBy(css = "div#content>div>div:nth-of-type(4) h4>a")
	WebElement deliveryMethod;

	@FindBy(css = "#collapse-shipping-method > div > div.radio > label > input[type=radio]")
	WebElement flatRateOption;

	@FindBy(css = "div#content>div>div:nth-of-type(5) h4>a")
	WebElement paymentMethod;

	@FindBy(css = "#collapse-payment-method > div > div.radio > label >input")
	WebElement cashOnDelivery;

	@FindBy(css = "input[name=agree]")
	WebElement termsAndCondition;

	@FindBy(css = "input#button-confirm")
	WebElement confirmOrder;

	public void clickConfirmOrderBtn() {
		confirmOrder.click();
	}

	public void checkTermsAndCondition() {
		termsAndCondition.click();
	}

	public void clickCashOnDeliveryOption() {
		cashOnDelivery.click();
	}

	public void clickpaymentMethod() {
		paymentMethod.click();
	}

	public void checkFlatrateOption() {
		flatRateOption.click();
	}

	public void clickDeliveryMethodOption() {
		deliveryMethod.click();
	}

	public void checkExistingAddressText() {
		checkExistingAddressText.click();
	}

	public void clickDeliverDetailsbtn() {
		deliverDetails.click();
	}

	public void clickregisterAccountbtn() {
		registerAccountbtn.click();
	}

	public void enterEmailIninputEMail() {
		inputEMail.sendKeys("rini@email.com");
	}

	public void enterPasswordIninputPassword() {
		inputPassword.sendKeys("rini1234");
	}

	public void clickloginbtn() {
		loginbtn.click();
	}

	public void enterFirstName() {
		firstName.sendKeys("Sucharita");
	}

	public void enterlastName() {
		lastName.sendKeys("Sen");
	}

	public void enterCompanyName() {
		company.sendKeys("SenCo");
	}

	public void enterAddress1() {
		address1.sendKeys("23 Bridge Road");
	}

	public void enterCityName() {
		city.sendKeys("Florida");
	}

	public void enterPostCode() {
		postCode.sendKeys("N3D3Y6");
	}

	public void selectCountryName() {
		Select sc = new Select(country);
		sc.selectByVisibleText("United Kingdom");

	}

	public void selectRegionOrState() {
		Select sc = new Select(regionOrState);
		sc.selectByVisibleText("Newport");
	}

	public void clickcontinuebtn() {
		continuebtn.click();
	}

}
