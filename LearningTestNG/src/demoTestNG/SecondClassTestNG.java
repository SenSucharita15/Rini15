package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

public class SecondClassTestNG {
	@Test
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
	@Test  
	public void Soft_Assert()  
	{  
		SoftAssert sa=new SoftAssert();
	 sa.assertEquals(true,false);  
	 System.out.println("soft assertion");  
	}  
	
	@Test  
	public void Hard_Assert()  
	{  
	 Assert.assertEquals(true, false); 
	 System.out.println("hard assertion"); 
	 System.out.println("failed---");
	 
	 
	}  
	@Test
	public void test4()
	{
		System.out.println("This is the test4 ");
	}
}
