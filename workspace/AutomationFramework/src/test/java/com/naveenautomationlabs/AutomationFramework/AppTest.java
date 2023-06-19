package com.naveenautomationlabs.AutomationFramework;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.naveenautomationlabs.AutomationFramework.base.TestBase;


public class AppTest extends TestBase
{
   @BeforeMethod
   void setup()
   {
	   initialisation();
   }
   
	
	@org.testng.annotations.Test
	
    public void test1()
    {
       Assert.assertEquals(true,true);
    }
	@AfterMethod
	void quit()
	{
		tearDown();
	}
	
}
