package AssignmentApril7;

import java.util.*;

public class PizzaBillPayment {
	double bill;
	double finalbill = 0;
	double price;
	//String choice;
	String[] pizza = { "SMALL", "MEDIUM", "LARGE" };
	int[]pepporoniPrice= {2,3,3};
	Scanner sc = new Scanner(System.in);
	private int j;
	private String choice;

	void getPizzaSize()
	{
		System.out.println("We have the following pizza ");
		for(int i=0;i<pizza.length;i++)
		{
		System.out.println(Arrays.toString(pizza));
		System.out.println("Enter the pizza size");
		String choice=sc.next();
		if(choice.equals("SMALL"))
		{
			price=price+15;
			break;
		}
		else if(choice.equals("MEDIUM"))
				{
			
			price=price+20;
			break;
				}
		else if(choice.equals("LARGE"))
		{
	price=price+25;
	break;
		}else
		{
			System.out.println("Invalid selection");
			System.out.println("Enter the option from the following");
			//break;
			continue;
			
		}
		
		//continue;
	}
		System.out.println("The price is"+price);
		//String choice;
		//return choice;
	}
	
	double wantExtraPepperoni()
	{
		System.out.println("Do you want extra pepperoni: 1.YES 2.NO");
		//int price1 = 0;
		
		int select=sc.nextInt();
		if(select==1)
		{
			for(int i=0;i<pizza.length;i++)
			{
				if(pizza[i]=="SMALL")
				{
					price=price+2;
					//break;
					//exit=true;
				}else if(pizza[i]=="MEDIUM")
				{
					price=price+3;
					break;
				}else if(pizza[i]=="LARGE")
				{
					price=price+3;
					break;
				}else
					System.out.println("Invalid entry");
				continue;
				
			}
			//exit=true;
		}
		
		
		return price;
				
	}
	double getExtraCheese()
	{
		System.out.println("Do you want extra cheese: 1.YES 2.NO");
		int select=sc.nextInt();
		if(select==1)
		{
			price=price+1;
		}
		return price;
	}
	
	
}
