package interviewJavaPrograms;

public class ChangeToLowerCAse {

	public static void main(String[] args) {
		
		
		String str="HELLO WORLD";
		String str1=str.toLowerCase();
		System.out.println(str1);
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			char lowercase=Character.toLowerCase(c);
			System.out.print(lowercase);
			
		}

	}

}
