package Loop;
import java.util.Scanner;

public class CheckAmountAndPin {

	//import java.util.Scanner; 
	//import java.util.*; 
	  
		int correctPin=1234;
		int enterPin;
		int amountWithdraw;
		int balance=3000;
		
		Scanner sc=new Scanner(System.in);
	   
		void CheckPinCorrect()
		{
			for(int count=1;count<=3;count++)
			{
				System.out.println("Enter the PIN");
				enterPin=  sc.nextInt();
				if(correctPin==enterPin)
				{
					System.out.println("Pin correct");
					System.out.println("Enter the amount to withdraw");
					amountWithdraw= sc.nextInt();
					if(amountWithdraw<= balance)
					  System.out.println(" the amount  withdraw" + amountWithdraw);
					else
					{
					System.out.println("Not Sufficient Balance. Please try a lesser amount");
					amountWithdraw= sc.nextInt();
					 if(amountWithdraw<= balance)
					      System.out.println(" the amount  withdraw" + amountWithdraw);
					 else
						 System.out.println(" not sufficient amount please restart the process");
					 
							}	
				
					break;
				}
		
				else if(correctPin!=enterPin && count<3 )
				{
					
					System.out.println("Pin Incorrect");
				}
				else if(correctPin!=enterPin && count>=3 )
				{
					
					System.out.println("Incorrect Pin entered 3 times.Card Blocked");
				}
			
		}
		
	}
}


