package com.naveenautomationlabs.AutomationFramework.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public static	WebDriver wd;
	FileInputStream fileInputStream;
	Properties prop;
	
	public TestBase()
	
	{
		prop=new Properties();
		try {
			
			fileInputStream = new FileInputStream(
					"C:\\Users\\santa\\git_test\\git_test_sucharita\\workspace\\AutomationFramework\\src\\main\\java\\com\\naveenautomationlabs\\AutomationFramework\\config\\config.properties");
		
	}catch(FileNotFoundException e)
		{
		e.printStackTrace();
		}
		
		try {
			prop.load(fileInputStream);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void initialisation()
	{
		String browserName=prop.getProperty("browser");
		
	switch(browserName)
	{
	case "chrome":
	wd=	WebDriverManager.chromedriver().create();
		//wd=new ChromeDriver();
		
		break;
	case "edge":
	wd=	WebDriverManager.edgedriver().create();
		//wd=new EdgeDriver();
		break;
	case "firefox":
	wd=	WebDriverManager.firefoxdriver().create();
		//wd=new FirefoxDriver();
		break;
		
		default:
			System.out.println("Not a valid browser name");
		
	 
	}
		//wd=new ChromeDriver();
		//wd.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		wd.get(prop.getProperty("URL"));
		wd.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("IMPLICIT_WAIT")), TimeUnit.SECONDS);
		wd.manage().window().maximize();
	}
	
	public void tearDown()
	{
		wd.quit();
	}
	

}
