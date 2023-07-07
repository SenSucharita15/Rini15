package com.naveenautomationlabs.AutomationFramework.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.naveenautomationlabs.AutomationFramework.Listeners.WebdriverEvents;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver wd;
private FileInputStream fileInputStream;
public Properties prop;
public static Logger logger;
private WebdriverEvents events;
private EventFiringWebDriver eDriver;
	
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
	
	@BeforeClass
	public void SetUpLogger() {
		logger = Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("log4j.properties");
		BasicConfigurator.configure();
		logger.setLevel(Level.ALL);

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

	eDriver = new EventFiringWebDriver(wd);
	events = new WebdriverEvents();
	eDriver.register(events);
	wd = eDriver;
		//wd=new ChromeDriver();
		//wd.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		wd.get(prop.getProperty("URL"));
		wd.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("IMPLICIT_WAIT")), TimeUnit.SECONDS);
		wd.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown()
	{
		wd.quit();
	}
	

}
