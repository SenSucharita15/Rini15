package interviewJavaPrograms;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString s=new ReverseString();
		String input="Hello world ";
		String reverseString=s.reverseString(input);
		
		System.out.println(" The original string "+ input);
		System.out.println("The reverse string is "+ reverseString);
		
		if(s.isPalindrome(input))
		{
			System.out.println(input + " is palindrome");
			
		}else
		{
			System.out.println(input + " is not palindrome");
			
		}

	}

}
