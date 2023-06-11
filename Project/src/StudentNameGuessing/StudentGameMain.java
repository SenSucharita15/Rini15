package StudentNameGuessing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StudentGameMain {

	public static void main(String[] args )throws IOException {
		// TODO Auto-generated method stub
		// String studentNames[]=
		// {"Aleena","Angel","Asha","Clemin","Gopesh","Hamneet","Jimna","Jobin","Jude","kamaldeep","Manpreets","Manpreetk","Mariya","Neela","Namitha","Nisha","Parminder","Rajat","Rojy","Sojan","Sucharita","Vindhuja"};

		//List<String>studentNames=Files.readAllLines(Paths.get("C:\\Users\\santa\\OneDrive\\Desktop\\sucharita\\name%20list.docx"));	System.out.println("Welcome to the Student Name Guessing Game ");
		System.out.println(" \n You have 5 points to win the Game :Good Luck ");
		StudentNameGuessingGame s1 = new StudentNameGuessingGame();
           	s1.displayRandomName();

		System.out.println();
		int points = s1.startGuessingTheLetter();

		System.out.println("\n The available points  :" + points);

		String correctName = s1.checkigTheCorrectName();
		System.out.println("  \t \t   " + correctName);

	}

}
