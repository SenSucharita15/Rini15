package assignmentApril15;

import java.util.HashMap;
import java.util.Scanner;

public class CrsScore {
	Scanner sc = new Scanner(System.in);

	int getAgeScore(int age) {
		HashMap<Integer, Integer> ageMap = new HashMap<Integer, Integer>();

		if (age >= 18 && age <= 35) {
			int ageScore = 12;
			System.out.println("The score point is " + ageScore);
			return ageScore;
			// break;
		} else {
			ageMap.put(36, 11);
			ageMap.put(37, 10);
			ageMap.put(38, 9);
			ageMap.put(39, 8);
			ageMap.put(40, 07);
			ageMap.put(41, 06);
			ageMap.put(42, 05);
			ageMap.put(43, 04);
			ageMap.put(44, 03);
			ageMap.put(45, 02);
			ageMap.put(46, 01);
			ageMap.put(47, 00);
			int ageScore = ageMap.get(age);
			System.out.println("The age score point is " + ageScore);
			return ageScore;
		}

	}

	int getEducationScore() {
		HashMap<String, Integer> educationMap = new HashMap<String, Integer>();
		// int educationScore=0;

		System.out.println(
				"Enter the education of the person :PHD/Master Degree/ 2 or more 3 years of University degree/diploma or12th +3years of Degree/Diploma ");

		String edu1 = sc.nextLine();
		educationMap.put("PHD", 25);
		educationMap.put("Master Degree", 23);
		educationMap.put("2 or more 3 years of University degree/diploma", 22);
		educationMap.put("12th +3years of Degree/Diploma", 21);
		int educationScore = educationMap.get(edu1);
		System.out.println(" The eductaion score point is" + " " + educationScore);
		return educationScore;

	}

	int experienceScore(double exp) {
		// int experienceScore = 0;
		int experienceScore = 0;
		if (exp >= 4 && exp <= 5) {
			experienceScore = 13;
			// System.out.println("The experience score point is:"+experienceScore);
			// return experienceScore;
		} else if (exp >= 6) {
			experienceScore = 15;
			// return experienceScore;
		}

		System.out.println("The experience score point is:" + experienceScore);
		return experienceScore;
	}

	int ieltsScore() {
		System.out.println("\n Enter the IELTS SCORE for LISTENING");
		int ieltsScore = 0;

		double listening = sc.nextDouble();
		if (listening >= 8) {
			ieltsScore = ieltsScore + 6;
			// int score1=6;
		} else if (listening == 7.5) {
			ieltsScore = ieltsScore + 5;

		}
		System.out.println("\n Enter the IELTS SCORE for SPEAKING");
		double speaking = sc.nextDouble();
		if (speaking >= 7) {
			// ieltsScore2 = 6;
			ieltsScore = ieltsScore + 6;
			// int score1=6;
		} else if (speaking == 6.5) {
			// ieltsScore2 = 5;
			ieltsScore = ieltsScore + 5;
		}
		System.out.println("\n Enter the IELTS SCORE for READING");
		// int ieltsScore;
		double reading = sc.nextDouble();
		if (reading >= 7) {
			// ieltsScore3 = 6;
			ieltsScore = ieltsScore + 6;
		} else if (reading == 6.5) {
			// ieltsScore3 = 5;
			ieltsScore = ieltsScore + 5;
		}
		System.out.println("\n Enter the IELTS SCORE for Writing");
		double writing = sc.nextDouble();
		if (writing >= 7) {
			// ieltsScore4 = 6;
			ieltsScore = ieltsScore + 6;
		} else if (writing == 6.5) {
			// ieltsScore4 = 5;
			ieltsScore = ieltsScore + 5;
		}

		// ieltsScore = ieltsScore1 + ieltsScore2 + ieltsScore3 + ieltsScore4;
		System.out.println("The IELTS score point is:" + ieltsScore);
		return ieltsScore;
	}

}
