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

public class Assignment1Login {
	
	
	
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
	public void validateLoginWithCorrectDetails() {

		// find the element in the DOM
		wd.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement emailInput = wd.findElement(By.cssSelector("#input-email"));
		WebElement password = wd.findElement(By.cssSelector("#input-password"));
		WebElement logIn = wd.findElement(By.cssSelector("input[value='Login']"));

		emailInput.sendKeys("rini@email.com");
		password.sendKeys("rini1234");
		logIn.click();
		// wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		Assert.assertEquals(wd.getTitle(), "My Account", "you are not on right page");
		System.out.println(wd.getTitle());
		System.out.println(wd.getCurrentUrl());
		// wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(520));

	}




	@AfterMethod
	public void tearDown() {
		// wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// wd.close();
	}
}
	


