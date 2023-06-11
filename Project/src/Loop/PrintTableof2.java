package Loop;
import java.util.Scanner;


public class PrintTableof2 {
int number;
int finalNumber=20;
	
	void printMultiples()
	{
		
		while(number<=finalNumber)
		{
			System.out.println(number);
			number+=2;
		}
	}
	void tableOfNumber()
	{
		System.out.println("Enter the number whose table need to be displayed");
		Scanner Sc=new Scanner(System.in);
		int num=Sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num +"*"+i+" = " +num*i);
			
		}
		
		
	}
}
	
