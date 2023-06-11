package com.sucharita.learningSelennium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSelenniumSession {
	
	
	
	WebDriver wd;
	
	@BeforeMethod
	public void setup()
	//Basic setup for Selenium
	{
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\Chrome\\chromedriver.exe");
		// initialize the instance of the WebDriver Interface
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		// load the webpage

		wd.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	}

	@Test
	public void validateLogin() {

		// find the element in the DOM
		WebElement emailInput = wd.findElement(By.cssSelector("input[name='email']"));
		WebElement password = wd.findElement(By.cssSelector("input[name='password']"));
		WebElement logIn = wd.findElement(By.cssSelector("input[value='Login']"));

		emailInput.sendKeys("tony@email.com");
		password.sendKeys("Password1");
		logIn.click();
		// wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		System.out.println(wd.getTitle());
		System.out.println(wd.getCurrentUrl());
		Assert.assertEquals(wd.getTitle(), "My Account", "you are not on right page");
		// wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(520));

	}

	@AfterMethod
	public void tearDown() {
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		wd.close();
	}
}
	


