package interviewJavaPrograms;

public class CheckNegativeOrPositive {

	public static void main(String[] args) {
		int number=-7;
		int absoluteValue=Math.abs(number);
		System.out.println(absoluteValue);
		if(absoluteValue>0)
		{
			System.out.println("Positive");
		}
		else if(absoluteValue<0)
		
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
	}

}
