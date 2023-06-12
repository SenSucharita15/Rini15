package interviewJavaPrograms;

import java.util.Arrays;

public class ReverseString {

	
	public String reverseString( String str)
	{
		int length=str.length();
		char[]reversed=new char[length];
		String str1="";
		
		for(int i=length-1,j=0;i>=0;i--,j++)
		{
			reversed[j]=str.charAt(i);
			str1=str1+reversed[j];
			
		}
		System.out.println(str1);
		return new  String(reversed);
		//return reversed;
	}
	
	public boolean checkPalindrome(String str)
	{
		String string=reverseString(str);
		return str.equals(string);
	}
	
}
