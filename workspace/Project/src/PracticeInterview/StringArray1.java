package PracticeInterview;
import java.util.Scanner;


public class StringArray1 {

	String []str= {"Raj","Ravi","Simran","Rahul"};
	Scanner Sc=new Scanner(System.in);
	
	void print()
	{
		//System.out.println(str);
		System.out.println("Enter the name you want in  replace position");
		String s=Sc.nextLine();
		System.out.println("Enter the name you want  to replace");
		String s1=Sc.nextLine();
		//System.out.println(s);
		for(int i=0;i<str.length;i++)
		{
			//System.out.println(str[i]);
		//String String;
		if(str[i].equals(s1))
			str[i]=s;
		
		}
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]];
		}
	}
	
	
	
}
