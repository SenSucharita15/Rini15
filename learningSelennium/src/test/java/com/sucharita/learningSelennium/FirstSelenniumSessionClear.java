package com.sucharita.learningSelennium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSelenniumSessionClear {

	WebDriver wd;
	WebDriverWait wait;

	@BeforeMethod
	public void setup()
	// Basic setup for Selenium
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\Chrome\\chromedriver.exe");
		// initialize the instance of the WebDriver Interface
		wd = new ChromeDriver();
		// wait = new WebDriverWait(wd, Duration.ofSeconds(20));
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wd.manage().window().maximize();

		// load the webpage

	}

//	@SuppressWarnings("deprecation")
	@Test
	public void validateSubmitWithMessage() {

		// find the element in the DOM

		wd.get("https://rahulshettyacademy.com/locatorspractice/");

		// wd.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=information/contact");
		WebElement userName = wd.findElement(By.id("inputUsername"));
		WebElement password = wd.findElement(By.name("inputPassword"));
		WebElement signIn = wd.findElement(By.cssSelector("button.submit "));

		// WebElement submit = wd.findElement(By.xpath("//input[@type='submit']"));

		userName.sendKeys("Sucharita");
		password.sendKeys("password");
		// signIn.sendKeys("Selenium Material");
		signIn.click();

		// WebElement submitMessage = wait
		// .until(ExpectedConditions.visibilityOfElementLocated(
		// By.xpath("//p[text()='Your enquiry has been successfully sent to the store
		// owner!']")));

		// wd.navigate().back();


		System.out.println(wd.getTitle());
		System.out.println(wd.getCurrentUrl());
		Assert.assertEquals(wd.getTitle(), "Rahul Shetty Academy - Login page", "you are not on right page");
		userName.clear();
		password.clear();

	}

	@AfterMethod
	public void tearDown() {
		// wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		// wd.close();
	}
}
