package InterviewJavaApril;
import java.util.Scanner;

public class FloatingNumberCheck {

	double number;
	
	 void check()
	 {
		  System.out.println("Enter the number");
		  Scanner sc=new Scanner(System.in);
		  number=sc.nextDouble();
		  
		  if(number==0)
		  {
			  System.out.println("The number is Zero ");
			  
		  }
		  else if(number<1)
		  {
			  System.out.println("Negative Small Number ");
		  }
		  else if(number>100000)
		  {
			  System.out.println(" Positive Large Number");
		  }
		  else if(number>1 && number<100000)
		  {
			  System.out.println("positive ");
		  }
		  
	 }
	 
}
