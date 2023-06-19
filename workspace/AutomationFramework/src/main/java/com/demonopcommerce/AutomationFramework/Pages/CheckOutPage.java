package com.demonopcommerce.AutomationFramework.Pages;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class CheckOutPage extends TestBase {

	Select sc;
	Actions actions;
	WebDriverWait wait;
	// WebDriver wd;

	public CheckOutPage() {
		PageFactory.initElements(wd, this);
	}

	// @FindBy(css = "select#BillingNewAddress_CountryId")
	@FindBy(xpath = "//*[@id=\"BillingNewAddress_CountryId\"]")
	WebElement country;

	@FindBy(xpath = "//option[text()='Albania']")
	WebElement countryOption;

	@FindBy(css = "select#BillingNewAddress_StateProvinceId")
	WebElement province;

	@FindBy(css = "input#BillingNewAddress_City")
	WebElement city;

	@FindBy(css = "input#BillingNewAddress_Address1")
	WebElement address;

	@FindBy(css = "input#BillingNewAddress_ZipPostalCode")
	WebElement zip;

	@FindBy(css = "input#BillingNewAddress_PhoneNumber")
	WebElement phoneNumber;

	@FindBy(css = "div#billing-buttons-container > button.button-1.new-address-next-step-button")
	WebElement continueBtn;

	@FindBy(css = "div#shipping-methods-form > ul > li:nth-child(1) > div.method-name")
	WebElement shippingTypeName;

	@FindBy(css = "ul#payment-method-block > li:nth-child(1) > div > div.payment-logo > label")
	WebElement paymentTypeName;

	@FindBy(css = "#shipping-method-buttons-container > button")
	WebElement continueAfterShipping;

	@FindBy(css = "div#payment-method-buttons-container > button")
	WebElement continueAfterPayment;

	@FindBy(css = "#payment-info-buttons-container > button ")
	WebElement paymentinforContinue;

	@FindBy(css = "#confirm-order-buttons-container > button")
	WebElement confirmButtonFinal;

	@FindBy(css = " div.page-body.checkout-data > div > div.title > strong")
	WebElement confirmationMessage;

	@FindBy(css = " #billing-buttons-container > button.button-1.new-address-next-step-button")
	WebElement continueWithAddressBtn;

	public void clickcontinueWithAddressBtn() {
		continueWithAddressBtn.click();
	}

	public String confirmationMessage() {
		String text = confirmationMessage.getText();
		return text;
	}

	public void clickconfirmButtonFinal() {
		confirmButtonFinal.click();
	}

	public void clickpaymentinforContinue() {
		paymentinforContinue.click();
	}

	public void clickcontinueAfterShipping() {
		continueAfterShipping.click();
	}

	public void clickcontinueAfterPayment() {
		continueAfterPayment.click();
	}

	public void clickShippingType() {
		shippingTypeName.click();
	}

	public void clickPaymentType() {
		paymentTypeName.click();
	}

	public void clickContinue() {
		continueBtn.click();
	}

	public void addPhoneNumber() {
		phoneNumber.sendKeys("1234");
	}
	public void addCity() {
		// city.sendKeys("Brampton");
		String city1 = UUID.randomUUID().toString();
		city.sendKeys(city1);
	}

	public void addZip() {
		// zip.sendKeys("M2K4H6");
		String zip1 = UUID.randomUUID().toString();
		zip.sendKeys(zip1);
	}

	public void addAddress() {
		// address.sendKeys("32 Green Road");
		String address1 = UUID.randomUUID().toString();
		address.sendKeys(address1);
	}

	public void addCounty() {

		// country.click();
		sc = new Select(country);
		wait = new WebDriverWait(wd, 10);
		country = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]")));
		// countryOption.click();

		sc.selectByVisibleText("Albania");
		// sc.selectByIndex(3);

		// actions = new Actions(wd);
		// actions.moveToElement(countryOption).click().perform();
	}

	public void addProvince() {
		sc = new Select(province);
		sc.selectByVisibleText("Alaska");
		// sc.selectByIndex(3);
	}

}

