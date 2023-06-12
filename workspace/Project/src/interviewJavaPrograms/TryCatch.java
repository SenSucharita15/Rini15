package interviewJavaPrograms;

public class TryCatch {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception{
		String str = null;
		
		String result=(str!=null)?str:"null";
		System.out.println(result);
		
		if(str !=null)
		{
			int length=str.length();
			System.out.println(length);
		}
		else
		{
			System.out.println("Text is null");
		}
		
		
		try
		{
			int data=50/0;
		}
		
		catch(ArithmeticException e)
		{
		System.out.println("Arithmetic Exceptions");
		System.out.println(	e.getMessage());
		throw e;
		}
		finally
		{
			System.out.println("Finally block will be exceited");
		}
		throw new Exception("Error");
		
	
	}

}
