package com.naveenautomationlabs.AutomationFramework.Pages1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class AccountLogin extends TestBase{
	public AccountLogin() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(id = "input-email")
	private WebElement emailInputField;

	@FindBy(id = "input-password")
	private WebElement passwordInputField;

	@FindBy(css = "input[value='Login']")
	private WebElement loginBtn;

	@FindBy(css = "div.form-group a")
	private WebElement forgotPasswordLink;

	@FindBy(css = "div.alert")
	private WebElement passwordResetLinkText;

	public void enterEmail() {
		emailInputField.sendKeys("tony@gmail.com");
	}

	public void enterPassword() {
		passwordInputField.sendKeys("Password2");
	}

	public MyAccount clickLoginBtn() {
		loginBtn.click();
		return new MyAccount();
	}

	public MyAccount loginToPortal() {
		enterEmail();
		enterPassword();
		return clickLoginBtn();
	}

	public ForgotYourPassword clickForgotPassword() {
		forgotPasswordLink.click();
		return new ForgotYourPassword();
	}

	public String getPasswordResetLinkSuccessMessageText() {
		return passwordResetLinkText.getText();
	}

}
	

