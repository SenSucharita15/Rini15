package StudentNameGuessing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.io.File;

public class StudentNameGuessingGame

{
	
	
	int points = 5;
	int wrongGuess = 0;
	boolean flag = false;
	// int index;
	int numGuessLetters = 0;
	//private String randomName;
	int index;
//	String randomName;
	String randomName;
	char[] guessedLetter = new char[randomName.length()];
	// To keep track of the guess letters
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	 

	
	
//List<String>studentNames;

	StudentNameGuessingGame() 
	{
		
	List<String>studentNames=Files.readStudentListFromFile(String filePath);	
Random random=new Random();
randomName=studentNames.get(random.nextInt(studentNames.size()));
	}
	
	List<String>readStudentListFromFile(String filePath)
	{
		List<String>studentNames=new Arraylist<>();
		
	}

	
	void displayRandomName() {
		//Random rand = new Random();
		// int index = rand.nextInt(names.length);
		System.out.println();
		for (int i = 0; i < randomName.length(); i++) {

			System.out.print(" -\t ");

		}
	}

	int startGuessingTheLetter() {
		// System.out.println("You are guessing ");

		while (points > 0) {
			// System.out.println("You are guessing ");

			System.out.println("\n Guess a letter :");
			System.out.println("You are now guessing the letter  ");

			//Scanner sc = new Scanner(System.in);
			char letter = sc.nextLine().charAt(0);
			// String inputLetter = Character.toString(letter);
			if (Character.isDigit(letter)) {
				System.out.println("Error:Please enter letter not digit:\n ");
			}

			// char letter = sc.next().charAt(0);
			boolean correctGuess = false;

			for (int i = 0; i < randomName.length(); i++) {

				if (randomName.charAt(i) == letter) {
					if (guessedLetter[i] == 0) {
						guessedLetter[i] = letter;
						numGuessLetters++;
						// System.out.println("The number of right guess is "+ numGuessLetters);
						correctGuess = true;
					}

				}
			}

			if (!correctGuess) {
				// int wrongGuess=0;
				points--;
				wrongGuess++;
				System.out.println("Number of Wrong guess is:: " + wrongGuess);

			}
			if (numGuessLetters == randomName.length()) {
//				System.out.println("congrats you guess the student name  " + student + " " + "correctly)");
//				// return;
				// flag = true;
				break;
			}
			// }
			System.out.print("Current guess is ");
			for (int i = 0; i < randomName.length(); i++) {
				if (guessedLetter[i] == 0) {
					System.out.print("-");

				} else {
					System.out.print(guessedLetter[i] + " ");
				}
			}
			System.out.println("\n \t Remaining Point is " + points);

		}
//int flag;
//		if (!flag) {
//			System.out.println("Sorry you lost the Game :the student name was:" + student);
//		}
		return points;
	}

	String checkigTheCorrectName() {

		for (int i = 0; i < randomName.length(); i++) {
			if (numGuessLetters == randomName.length()) {
				System.out.println("Congrats You WIN : you guess the student name  " + " " + "correctly)");
				// return;
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Sorry you lost the Game :the student name was:" + " ");
		}
		return randomName;
	}

}
