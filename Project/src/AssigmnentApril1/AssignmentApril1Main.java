package AssigmnentApril1;
import java.util.Scanner;
public class AssignmentApril1Main {
//int choice;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CheckIsPrime prime=new CheckIsPrime();
		prime.checkPrime();
		Calculator c= new Calculator();
		Scanner sc=new Scanner(System.in);
		
		 boolean exit=false;
		 while(!exit)
		 {
		
	System.out.println("enter the option:1-square 2-Cube 3-Sum 4-Difference 5-Product 6-Division 7-Exit ");
		  int choice=sc.nextInt();
	//	 if(choice>=6)
		//	{
			     //   System.out.print("\nError! Incorrect choice.\n");
			       // System.out.println(": Try a valid number option");
			        //System.out.println("mainMenu:-option:1-square 2-Cube 3-Sum 4-Difference 5-Product 6-Division ");
			    // int  choice = sc.nextInt();
			 
		
			switch (choice)
			 {
			case 1:
				c.squareOfNumbers();
				
					break;
				
			case 2:
		
				c.cubeOfNumbers();
				
				break;
		
			case 3:
				c.sumOfNumbers();
				break;
				
			case 4:
				c.differenceOfNumbers();
				break;
				
			case 5:
				c.productOFNumbers();
				break;
				
			case 6:
				c.divisionOfNumbers();
				break;
				
			case 7:
			exit=true;
				break;
		
			default: 
		
				System.out.println("Invalid number: Try a valid number option");
				
			   break;
			     }
			 //}while(choice<=6);
		  }
		 System.out.println(" Thank You.");
		
	      }
	
} 
