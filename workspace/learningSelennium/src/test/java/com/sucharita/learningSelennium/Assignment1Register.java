package com.sucharita.learningSelennium;

import java.time.Duration;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assignment1Register {

	WebDriver wd;
	WebDriverWait wait;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setup()
	// Basic setup for Selenium
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\Chrome\\chromedriver.exe");
		// initialize the instance of the WebDriver Interface
		wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://naveenautomationlabs.com/opencart/");
		// wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(wd, Duration.ofSeconds(5));

	}

//	@SuppressWarnings("deprecation")
	@SuppressWarnings("deprecation")
	@Test
	public void validateRegister() {

		wd.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement firstName = wd.findElement(By.cssSelector("#input-firstname"));
		WebElement lastName = wd.findElement(By.cssSelector("#input-lastname"));
		WebElement email = wd.findElement(By.cssSelector("#input-email"));
		WebElement telephone = wd.findElement(By.cssSelector("#input-telephone"));
		WebElement password = wd.findElement(By.cssSelector("#input-password"));
		WebElement confirmPassword = wd.findElement(By.cssSelector("#input-confirm"));
		WebElement privacyPolicyCheckBox = wd.findElement(By.name("agree"));
		WebElement newsletter = wd.findElement(By.xpath("//div[@class=\"form-group\"]/div/label[2]/input"));
		privacyPolicyCheckBox.click();
		WebElement submit = wd.findElement(By.cssSelector("input[type=\"submit\"]"));
		  String firstName1 = UUID.randomUUID().toString();
	        String lastName1 = UUID.randomUUID().toString();
	        String email1 = UUID.randomUUID().toString() + "@Yahoo.com";
	        String telephone1 = UUID.randomUUID().toString().substring(0, 10);
	        String password1 = UUID.randomUUID().toString();

		

		firstName.sendKeys(firstName1);
		lastName.sendKeys(lastName1);
		email.sendKeys(email1);
		telephone.sendKeys(telephone1);
		password.sendKeys(password1);
		confirmPassword.sendKeys(password1);
		newsletter.click();
		submit.click();

		// Assert.assertEquals(sc.getFirstSelectedOption().getText(), "United Kingdom",
		// "United kingdom not available");

		// wait for the registration to complete
		// Add wait
		// Perform Assertion to verify the registration process

		WebElement successMessage = wd.findElement(By.cssSelector("div#content>h1"));
		Assert.assertEquals(successMessage.getText(), "Your Account Has Been Created!", "Registration Failed");
		System.out.println(successMessage.getText());
		// WebElement warningMessage = wd
		// .findElement(By.cssSelector("#account-register >
		// div.alert.alert-danger.alert-dismissible"));
		// Assert.assertEquals(warningMessage.getText(), "Warning: E-Mail Address is
		// already registered!",
		// "Email is not Registered");
		// System.out.println(warningMessage.getText());

	}

	@Test
	public void validateRegisterWithWrongConfirmPassword() {

		wd.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement firstName = wd.findElement(By.cssSelector("#input-firstname"));
		WebElement lastName = wd.findElement(By.cssSelector("#input-lastname"));
		WebElement email = wd.findElement(By.cssSelector("#input-email"));
		WebElement telephone = wd.findElement(By.cssSelector("#input-telephone"));
		WebElement password = wd.findElement(By.cssSelector("#input-password"));
		WebElement confirmPassword = wd.findElement(By.cssSelector("#input-confirm"));
		WebElement privacyPolicyCheckBox = wd.findElement(By.name("agree"));
		WebElement newsletter = wd.findElement(By.xpath("//div[@class=\"form-group\"]/div/label[2]/input"));
		privacyPolicyCheckBox.click();
		WebElement submit = wd.findElement(By.cssSelector("input[type=\"submit\"]"));

		firstName.sendKeys("raja");
		lastName.sendKeys("dutta");
		email.sendKeys("dutta@email.com");
		telephone.sendKeys("12345");
		password.sendKeys("raja");
		confirmPassword.sendKeys("rini");
		newsletter.click();
		submit.click();
		WebElement errorMessage = wd
				.findElement(By.xpath("//div[text()=\'Password confirmation does not match password!\']"));
		String message = "Password confirmation does not match password!";
		assert errorMessage.isDisplayed() && errorMessage.getText().equals(message) : "Error message not displayed";
		System.out.println(message);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void validateRegisterWithExistingEmail() {

		wd.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement firstName = wd.findElement(By.cssSelector("#input-firstname"));
		WebElement lastName = wd.findElement(By.cssSelector("#input-lastname"));
		WebElement email = wd.findElement(By.cssSelector("#input-email"));
		WebElement telephone = wd.findElement(By.cssSelector("#input-telephone"));
		WebElement password = wd.findElement(By.cssSelector("#input-password"));
		WebElement confirmPassword = wd.findElement(By.cssSelector("#input-confirm"));
		WebElement privacyPolicyCheckBox = wd.findElement(By.name("agree"));
		WebElement newsletter = wd.findElement(By.xpath("//div[@class=\"form-group\"]/div/label[2]/input"));
		privacyPolicyCheckBox.click();
		WebElement submit = wd.findElement(By.cssSelector("input[type=\"submit\"]"));

		firstName.sendKeys("Sucharita");
		lastName.sendKeys("sen");
		email.sendKeys("rini@email.com");
		telephone.sendKeys("1234");
		password.sendKeys("rini1234");
		confirmPassword.sendKeys("rini1234");
		newsletter.click();
		submit.click();

		// wait for the registration to complete
		// Add wait
		// Perform Assertion to verify the registration process

		WebElement warningMessage = wd
				.findElement(By.cssSelector("#account-register > div.alert.alert-danger.alert-dismissible"));
		String message = warningMessage.getText();
		assert warningMessage.isDisplayed() && warningMessage.getText().equals(message) : "Error message not displayed";
		System.out.println(warningMessage.getText());

	}

	@Test
	public void validateRegisterWithMissingField() {

		// WebElement register = wd.findElement(By.cssSelector("#top-links > ul >
		// li.dropdown.open > ul > li:nth-child(1) > a"));
		// register.click();
		wd.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement firstName = wd.findElement(By.cssSelector("#input-firstname"));
		WebElement lastName = wd.findElement(By.cssSelector("#input-lastname"));
		WebElement email = wd.findElement(By.cssSelector("#input-email"));
		WebElement telephone = wd.findElement(By.cssSelector("#input-telephone"));
		WebElement password = wd.findElement(By.cssSelector("#input-password"));
		WebElement confirmPassword = wd.findElement(By.cssSelector("#input-confirm"));
		WebElement privacyPolicyCheckBox = wd.findElement(By.name("agree"));
		WebElement newsletter = wd.findElement(By.xpath("//div[@class=\"form-group\"]/div/label[2]/input"));
		// privacyPolicyCheckBox.click();
		WebElement submit = wd.findElement(By.cssSelector("input[type=\"submit\"]"));

		firstName.clear();
		lastName.clear();
		email.clear();
		telephone.clear();
		password.clear();
		confirmPassword.clear();
		// newsletter.click();
		submit.click();

		// wait for the registration to complete
		// Add wait
		// Perform Assertion to verify the registration process

		WebElement errorMessage = wd.findElement(By.xpath("//*[@id=\"account-register\"]/div[1]"));
		String expectedErrorMessage = "Warning: You must agree to the Privacy Policy!";
		assert errorMessage.isDisplayed() && errorMessage.getText().equals(expectedErrorMessage)
				: "Error message not displayed";
	}

	@AfterMethod
	public void tearDown() {
		// wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.close();
	}
}
