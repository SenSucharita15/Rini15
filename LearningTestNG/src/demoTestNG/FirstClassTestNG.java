package demoTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FirstClassTestNG {
	//@Test @Ignore
	//to ignore a particular test
	@Test(priority=3)
	public void test1()
	{
		System.out.println("This is the test1 ");
	}
	@BeforeMethod
	//test annotated method
	public void beforeEachMethod()
	{
		System.out.println("This method starts before the every method");
	}
	@BeforeClass
	public void beforeEachClass()
	{
		System.out.println("This method starts before the every class");
	}
	@AfterClass
	public void afterEachClass()
	{
		System.out.println("This method starts after the every class");
	}
	@AfterMethod
	public void afterEachMethod()
	{
		System.out.println("This method starts after the every method");
	}
	@BeforeTest
	public void beforeTestMethod()
	{
		System.out.println("This method starts before the test-open the browser");
	}
	@AfterTest
	public void AfterTestMethod()
	{
		System.out.println("This method starts after  the test-close the browser");
	}
	//@Test(enabled=false)
	//by passing arguements
	@Test (dependsOnMethods="test3")
	//depends on  a particular test after that it will run
	public void test2()
	{
		System.out.println("This is the test2 ");
	} 

	//@Test (invocationCount =2)
	//number of times a test case
	@Test
	public void test3()
	{
		System.out.println("This is the test3 ");
	}
}
