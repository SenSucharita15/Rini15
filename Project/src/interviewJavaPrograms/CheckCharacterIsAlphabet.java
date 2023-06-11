package interviewJavaPrograms;

public class CheckCharacterIsAlphabet {

	public static void main(String[] args) {
		
		char a='A';
		char b='1';
		char c='$';
		
		if(CheckCharacterIsAlphabet.checkAlphabet(a))
				{
			System.out.println("alphabet");
				}
		else
		{
			System.out.println("not alphabet");
		}
	boolean result=	CheckCharacterIsAlphabet.checkAlphabet(b);
	System.out.println(result);
		boolean result1=CheckCharacterIsAlphabet.checkAlphabet(c);
		System.out.println(result1);

	}
	
	public static boolean checkAlphabet(char a)
	{
		return Character.isAlphabetic(a);

	}

}
