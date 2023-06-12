package interviewJavaPrograms;

public class StringUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// public class StringToUppercase {
		// public static void main(String[]args)

		String string1 = "hello world";
		String string2 = string1.toUpperCase();
		System.out.println(" Original String is " + string1);
		System.out.println("Uppercase is " + string2);

		String uppercase = convertToUppercase(string1);
		System.out.println("The uppercase letter is"+uppercase);
	}

	public static String convertToUppercase(String string1) {

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < string1.length(); i++) {
			char currentChar = string1.charAt(i);
			char uppercase = Character.toUpperCase(currentChar);
			result.append(uppercase);
			
		}
		//System.out.println(result);
		return result.toString();

	}

}
