package com.sucharita.learningSelennium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment1ChangePassword {
	
	
	
	WebDriver wd;
	WebDriverWait wait;
	
	@BeforeMethod
	public void setup()
	//Basic setup for Selenium
	{
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\Chrome\\chromedriver.exe");

		wd = new ChromeDriver();
		wd.get("https://naveenautomationlabs.com/opencart/");
		wd.manage().window().maximize();
		wait = new WebDriverWait(wd, Duration.ofSeconds(15));
	}

	@Test
	public void validateChangePasswordWithMismatchPassword() {

		// find the element in the DOM
		wd.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement emailInput = wd.findElement(By.cssSelector("#input-email"));
		WebElement password = wd.findElement(By.cssSelector("#input-password"));
		WebElement logIn = wd.findElement(By.cssSelector("input[value='Login']"));

		emailInput.sendKeys("rini@email.com");
		password.sendKeys("rini1234");
		logIn.click();

		WebElement changeYourPassword = wd
				.findElement(By.cssSelector("#content > ul:nth-child(2) > li:nth-child(2) > a"));
		changeYourPassword.click();
		WebElement password1 = wd.findElement(By.id("input-password"));
		WebElement confirmPassword = wd.findElement(By.id("input-confirm"));

		password1.sendKeys("rini1234");
		confirmPassword.sendKeys("rini12345");
		WebElement submit = wd.findElement(By.cssSelector("input[value='Continue']"));
		submit.click();
		WebElement errorMessage = wd.findElement(By.cssSelector("div[class='text-danger']"));
		String message = errorMessage.getText();
		Assert.assertEquals(message, "Password confirmation does not match password!",
				"No message is displayed");
		System.out.println(message);
		// wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(520));

	}

	@Test
	public void validatePasswordChangeWithCorrectDetails() {

		// find the element in the DOM
		wd.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement emailInput = wd.findElement(By.cssSelector("#input-email"));
		WebElement password = wd.findElement(By.cssSelector("#input-password"));
		WebElement logIn = wd.findElement(By.cssSelector("input[value='Login']"));

		emailInput.sendKeys("rini@email.com");
		password.sendKeys("rini1234");
		logIn.click();

		WebElement changeYourPassword = wd
				.findElement(By.cssSelector("#content > ul:nth-child(2) > li:nth-child(2) > a"));
		changeYourPassword.click();
		WebElement password1 = wd.findElement(By.id("input-password"));
		WebElement confirmPassword = wd.findElement(By.id("input-confirm"));

		password1.sendKeys("rini12345");
		confirmPassword.sendKeys("rini12345");
		WebElement submit = wd.findElement(By.cssSelector("input[value='Continue']"));
		submit.click();
		WebElement successMessage = wd
				.findElement(By.cssSelector("#account-account > div.alert.alert-success.alert-dismissible"));
		String message = successMessage.getText();
		Assert.assertEquals(message, "Success: Your password has been successfully updated.",
				"No message is displayed");
		System.out.println(message);
		// wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(520));

	}

	@Test
	public void validatePasswordChangeWithMissingField() {

		// find the element in the DOM
		wd.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement emailInput = wd.findElement(By.cssSelector("#input-email"));
		WebElement password = wd.findElement(By.cssSelector("#input-password"));
		WebElement logIn = wd.findElement(By.cssSelector("input[value='Login']"));

		emailInput.sendKeys("rini@email.com");
		password.sendKeys("rini12345");
		logIn.click();

		WebElement changeYourPassword = wd
				.findElement(By.cssSelector("#content > ul:nth-child(2) > li:nth-child(2) > a"));
		changeYourPassword.click();
		WebElement password1 = wd.findElement(By.id("input-password"));
		WebElement confirmPassword = wd.findElement(By.id("input-confirm"));

		// password1.sendKeys("rini12345");
		// confirmPassword.sendKeys("rini12345");
		WebElement submit = wd.findElement(By.cssSelector("input[value='Continue']"));
		submit.click();
		WebElement errorMessage = wd.findElement(By.cssSelector("div[class='text-danger']"));
		String message = errorMessage.getText();
		Assert.assertEquals(message, "Password must be between 4 and 20 characters!",
				"No message is displayed");
		System.out.println(message);
		// wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(520));

	}

	@Test
	public void validatePasswordChangeWithWeakPassword() {

		// find the element in the DOM
		wd.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement emailInput = wd.findElement(By.cssSelector("#input-email"));
		WebElement password = wd.findElement(By.cssSelector("#input-password"));
		WebElement logIn = wd.findElement(By.cssSelector("input[value='Login']"));

		emailInput.sendKeys("rini@email.com");
		password.sendKeys("rini12345");
		logIn.click();

		WebElement changeYourPassword = wd
				.findElement(By.cssSelector("#content > ul:nth-child(2) > li:nth-child(2) > a"));
		changeYourPassword.click();
		WebElement password1 = wd.findElement(By.id("input-password"));
		WebElement confirmPassword = wd.findElement(By.id("input-confirm"));

		password1.sendKeys("123");
		confirmPassword.sendKeys("123");
		WebElement submit = wd.findElement(By.cssSelector("input[value='Continue']"));
		submit.click();
		WebElement errorMessage = wd.findElement(By.cssSelector("div[class='text-danger']"));
		String message = errorMessage.getText();
		Assert.assertEquals(message, "Password must be between 4 and 20 characters!", "No message is displayed");
		System.out.println(message);
		// wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(520));

	}




	@AfterMethod
	public void tearDown() {
		// wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// wd.close();
	}
}
	


