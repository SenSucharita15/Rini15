package interviewJavaPrograms;

public class ReverseString {

	
	public String reverseString( String str)
	{
		int length=str.length();
		char[]reversed=new char[length];
		
		for(int i=length-1,j=0;i>=0;i--,j++)
		{
			reversed[j]=str.charAt(i);
		}
		return new  String(reversed);
		//return reversed;
	}
	
	public boolean checkPalindrme(String str)
	{
		String stringreverse=reverseString(str);
		return str.equals(stringreverse);
		
	}
	
}
