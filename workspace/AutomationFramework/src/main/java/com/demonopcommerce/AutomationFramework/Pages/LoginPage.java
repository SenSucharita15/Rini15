package com.demonopcommerce.AutomationFramework.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "input#Email")
	private WebElement emailField;

	@FindBy(css = "input#Password")
	private WebElement passwordFiled;

	@FindBy(css = "button.login-button")
	private WebElement loginBtn;

	public void enterEmail(String email1) {
		emailField.sendKeys(email1);
	}

	public void enterPassword(String password1) {
		passwordFiled.sendKeys(password1);
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}
}
