


package StudentNameGuessing;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class StudentNameGuessingGameN {
	
	private String studentName;
	private int points=5;
	
	public StudentNameGuessingGameN(String filePath)
	{
		try {
			BufferedReader reader=new BufferedReader(new FileReader(filePath));
			ArrayList<String>students=new ArrayList<String>();
			String line=reader.readLine();
			while(line!=null)
			{
				students.add(line);
				line=reader.readLine();
			}
			Random random=new Random();
			this .studentName=students.get(random.nextInt(students.size()));
		}catch(IOException e)
		{
			System.out.println("Error "+e.getMessage());
		}
	}
	
	void displayRandomName() {
		//Random rand = new Random();
		// int index = rand.nextInt(names.length);
		System.out.println();
		for (int i = 0; i < studentName.length(); i++) {

			System.out.print(" -\t ");

		}
	}
	public void play()
	{
		Scanner scanner=new Scanner(System.in);
		int length=studentName.length();
		char[]guessedName=new char[length];
		Arrays.fill(guessedName, '_');
		while(points>0)
		{
			System.out.println("\n Guess the student name"+String.valueOf(guessedName));
			System.out.println("You have  "+" "+ points+ " points left ");
			System.out.println(" enter a letter ");
			String input=scanner.nextLine();
			if(input.length()==1) {
				char letter=input.charAt(0);
				boolean found=false;
				for(int i=0;i<length;i++)
				{
					if(studentName.charAt(i)==letter) {
						guessedName[i]=letter;
						found =true;
						
					}
				}
				if(!found)
				{
					points--;
					System.out.println("Letter not found");
				}
			}else {
				System.out.println("Enter one letter at a time");
			}
			if(Arrays.equals(guessedName, studentName.toCharArray()))
					{
				System.out.println("Congrats "+"Student name is"+studentName);
				return;
				
			}
				
		}
		System.out.println("Game over:The student name was "+" "+studentName);
		
	}
	

}
