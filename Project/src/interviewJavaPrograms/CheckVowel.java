package interviewJavaPrograms;
import java.util.*;


public class CheckVowel {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the letter");
	char c=sc.next().charAt(0);
	sc.close();
	
	if(isVowel(c))
	{
		System.out.println("vowel");
	
		}
	else
		System.out.println("not vowel");
		
		
		

	}
	public static boolean isVowel(char c)
	{
	char c1=Character.toLowerCase(c)	;
	return c1=='a'|| c1=='e'||c1=='i'||c1=='0' || c1=='u';
	}

}

