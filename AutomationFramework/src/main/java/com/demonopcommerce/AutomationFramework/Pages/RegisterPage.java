package com.demonopcommerce.AutomationFramework.Pages;

import java.util.UUID;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class RegisterPage extends TestBase {

	public RegisterPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "input#FirstName")
	WebElement firstName;

	@FindBy(css = "input#LastName")
	WebElement lastName;

	@FindBy(css = "input#Email")
	WebElement email;

	@FindBy(css = "input#Password")
	WebElement password;

	@FindBy(css = "input#ConfirmPassword")
	WebElement confirmPassword;

	@FindBy(css = "button#register-button")
	WebElement registerBtn;

	@FindBy(css = "a.register-continue-button  ")
	WebElement continueBtn;

	public void enterFirstName() {
		// firstName.sendKeys("John");
		String firstName1 = UUID.randomUUID().toString();
		firstName.sendKeys("firstName1");
	}

	public void enterLastName() {
		// lastName.sendKeys("Johny");
		String lastName1 = UUID.randomUUID().toString();
		lastName.sendKeys("lastName1");
	}

	public void enterEmail(String email1) {
		// email.sendKeys("a2@email.com");
		// String email1 = UUID.randomUUID().toString() + "@Yahoo.com";
		email.sendKeys(email1);
	}

	public void enterPassword(String password1) {
		password.sendKeys(password1);
	}

	public void enterCofirmPassword(String password1) {
		confirmPassword.sendKeys(password1);
	}

	public void clickRegisterBtn() {
		registerBtn.click();
	}

	public void clickContinueBtn() {
		continueBtn.click();
	}
}
