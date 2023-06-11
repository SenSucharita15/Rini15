package AssignmentApril7;
import java.util.Arrays;
import java.util.Scanner;

public class PhoneName {
	int i;
	
	String []Samsung= {"S20","S21","Flip3","Fold3"};
	String []Google= {"Google Pixel 6","Google Pixel 6 Pro","Google Pixel Pro","Google Pixel 5"};
	String []Apple= {"iphone 12","iphone 12 Mini","iphone 11","iphone 11 Mini"};
	
	Scanner sc=new Scanner (System.in);
	String brandName;
	//System.out.println("All the available products are as follows");
	
	void getTheProducts()
	{
		System.out.println("All the available products are as follows");
		System.out.println("\n Samsung products are ::");
	//	for(int i=0;i<Samsung.length;i++)
			System.out.println(Arrays.toString(Samsung));
		System.out.println("\n Google products are  ::");
		//for(int i=0;i<Google.length;i++)
		System.out.println(Arrays.toString(Google));
		System.out.println("\n Apple products are ::");
	//	for(int i=0;i<Apple.length;i++)
			//System.out.print(" "+" " +Apple[i]);
		System.out.println(Arrays.toString(Apple));
		
		System.out.println("\n\n Enter the brand name to display the available phones: Samsung,Google or Apple");
		String brandname=sc.nextLine();
		System.out.println("\n The brand name Selected is "+ " "+brandname);
		
		if(brandname.equals("Samsung"))
		{
		System.out.println("Available products are");
			//for(int i=0;i<Samsung.length;i++)
			//{
				//System.out.println("  "+"  "+Samsung[i]);
		System.out.println(Arrays.toString(Samsung));
	   	    //}
		}
		else if(brandname.equals("Google"))
				{
			System.out.println("Available products are");
			for(int i=0;i<Google.length;i++)
	     	{
				System.out.print("  "+"  "+Google[i]);
				}
			}
		else  if(brandname.equals("Apple"))
			{
			System.out.println("Available products are");
		for(int i=0;i<Apple.length;i++)
         	{
			System.out.print("  "+"  "+Apple[i]);
			}
		}
	else
	{
		System.out.println("Phone Brand  not found");
		
	}
		System.out.println("\n \n Enter the product  to find");
		String product=sc.nextLine();
		if(product.equals("S20") || product.equals("S21")||product.equals("Flip3")||product.equals("Fold3"))
		{
			System.out.println("Your product selected is"+product);
		}
		else if(product.equals("Google Pixel 6")||product.equals("Google Pixel 6 Pro")||product.equals("Google Pixel Pro")||product.equals("Google Pixel 5"))
			
		{
			System.out.println("Your product selected is"+product);
		}
		else if(product.equals("iphone 12")||product.equals("iphone 12 Mini")||product.equals("iphone 11")||product.equals("iphone 11 Mini"))
		{
			System.out.println("Your product selected is"+product);
		}
		else
		{
			System.out.println("Please select a product from the list");
		}
		
	}
		
	 	}

	
		

			

	
	


