package com.sucharita.learningSelennium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSelenniumSessionImplicitWait {

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
		wd.get("https://www.webroot.com/us/en/home/products/compare");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(wd, Duration.ofSeconds(10));

		wd.findElement(By.id("onetrust-accept-btn-handler")).click();


	}

//	@SuppressWarnings("deprecation")
	@Test
	public void validateButtonIsEnabled() {
		// wd.navigate().refresh();
		// WebElement buyNowBtn = wd.findElement(By.xpath("(//a[text()='Buy
		// now'])[2]"));
		WebElement buy = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Buy now'])[2]")));
		buy.click();

		WebElement selectCountryFiled = wd.findElement(By.cssSelector("select[name='billing.country']"));
		// selectCountryFiled.click();
		Select sc = new Select(selectCountryFiled);
		sc.selectByIndex(4);
		Assert.assertEquals(sc.getFirstSelectedOption().getText(), "United Kingdom", "United kingdom not available");

		sc.selectByValue("IN");
		Assert.assertEquals(sc.getFirstSelectedOption().getText(), "India", "India not available");

		sc.selectByVisibleText("China");
		Assert.assertEquals(sc.getFirstSelectedOption().getText(), "China", "China not available");


	}

	@AfterMethod
	public void tearDown() {
		// wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wd.close();
	}
}
