package com.sucharita.learningSelennium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSelenniumSessionWait {

	WebDriver wd;
	WebDriverWait wait;

	@BeforeMethod
	public void setup()
	// Basic setup for Selenium
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\Chrome\\chromedriver.exe");
		// initialize the instance of the WebDriver Interface
		wd = new ChromeDriver();
		wait = new WebDriverWait(wd, Duration.ofSeconds(20));
		// wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wd.manage().window().maximize();

		// load the webpage

	}

//	@SuppressWarnings("deprecation")
	@Test
	public void validateSubmitWithMessage() {

		// find the element in the DOM

		wd.get("https://naveenautomationlabs.com/opencart/");

		wd.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=information/contact");
		WebElement nameInput = wd.findElement(By.xpath("//input[@id='input-name']"));
		WebElement email = wd.findElement(By.xpath("//input[@id='input-email']"));
		WebElement submitEnquiry = wd.findElement(By.xpath("//textarea[@id='input-enquiry']"));

		WebElement submit = wd.findElement(By.xpath("//input[@type='submit']"));

		nameInput.sendKeys("Sucharita");
		email.sendKeys("a@email.com");
		submitEnquiry.sendKeys("Selenium Material");
		submit.click();
		// WebElement submitMessage = wd.findElement(By.xpath("//*[@id='content']/p"));
		// wait = new WebDriverWait(wd, Duration.ofSeconds(30));
		WebElement submitMessage = wait
				.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//p[text()='Your enquiry has been successfully sent to the store owner!']")));
		System.out.println(submitMessage.getText());
		Assert.assertEquals(submitMessage.getText(), "Your enquiry has been successfully sent to the store owner!",
				"Not the right ,message");
		wd.navigate().back();


		System.out.println(wd.getTitle());
		System.out.println(wd.getCurrentUrl());
		Assert.assertEquals(wd.getTitle(), "Contact Us", "you are not on right page");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	@AfterMethod
	public void tearDown() {
		// wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		wd.close();
	}
}
