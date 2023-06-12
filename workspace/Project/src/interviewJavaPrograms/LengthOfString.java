package interviewJavaPrograms;

import java.util.stream.Stream;

public class LengthOfString {

	public static void main(String[] args) {
		
		String str="Hello World";
		
		int length=str.length();
		//String str1=new Stream[length];
		System.out.println("The length of String is "+ length);
		int count=0;
		for( int i=0;i<str.length();i++)
		{
			System.out.println("\t"+str.charAt(i));
			count++;
		}
		System.out.println("The length of the string is "+ count);

	}

}
