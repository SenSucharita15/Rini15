package interviewJavaPrograms;

public class FindSubString {

	public static void main(String[] args) {
	String str="Hello World";
	String subString="World";
	String str1=str.concat("Rini");
	System.out.println(str1);
	StringBuilder sb=new StringBuilder();
	sb.append("Raja");
	sb.append(" ");
	sb.append('a');
	String result=sb.toString();
	System.out.println(result);
	
	
	int  index=str.indexOf(subString);
	
	if(index!=-1)
	{
		System.out.println(" Present");
		System.out.println(index);
	}
	else
		System.out.println("Not present");
	
	 if(str.contains(subString))
	 {
		 System.out.println(" substring present");
	 }
	 else
		 System.out.println(" substring not present");
	}

}
