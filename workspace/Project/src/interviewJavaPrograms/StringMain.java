package interviewJavaPrograms;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString s=new ReverseString();
		String input="Hello world ";
		//Strind d=input.
		String reverseString=s.reverseString(input);
		
		System.out.println(" The original string "+ input);
		System.out.println("The reverse string is "+ reverseString);
		
		if(s.checkPalindrome(input))
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not palindrome");
		}

	}

}
