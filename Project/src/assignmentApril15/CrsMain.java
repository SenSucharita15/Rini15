package assignmentApril15;

import java.util.Scanner;

public class CrsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice;
		int additionalPoint;
		int totalPointScore;
		CrsScore c1 = new CrsScore();
		System.out.println("Enter the age of the person");
		int age = sc.nextInt();
		int ageScore = c1.getAgeScore(age);
		// System.out.println("Enter the education of the person from the following:");
		// String education=sc.nextLine();

		System.out.println("Enter the experince of the person");
		double exp = sc.nextDouble();
		int expScore = c1.experienceScore(exp);

		// System.out.println("Enter the education of the person :PHD/Master Degree/ 2
		// or more 3 years of University degree/diploma or12th +3years of Degree/Diploma
		// ");

		// String edu=sc.nextLine();
		// System.out.println(edu);

		int eduScore = c1.getEducationScore();
		int ieltsSCore = c1.ieltsScore();
		int relativePoint = 0;
		System.out.println(
				"\n Do you have any relative in CANADA who is a PR or citizen: from the following: uncle,aunty,brother,sister,parents,grandparents");
		System.out.println("1.YES  2.NO");
		choice = sc.nextInt();
		if (choice == 1) {
			relativePoint = 5;
		} else if (choice == 2) {
			relativePoint = 0;
		}
		System.out.println("\n Did you study atleast 2 years in CANADA");
		System.out.println("1.YES  2.NO");
		choice = sc.nextInt();
		int studyPoint = 0;
		if (choice == 1) {
			studyPoint = 5;
		} else if (choice == 2) {
			studyPoint = 0;
		}
		System.out.println("\n Did you work atleast 1 year under NOC 0,A,B");
		System.out.println("1.YES  2.NO");
		choice = sc.nextInt();
		int workPoint = 0;
		if (choice == 1) {
			workPoint = 10;
		} else if (choice == 2) {
			workPoint = 0;
		}

		additionalPoint = workPoint + studyPoint + relativePoint;
		System.out.println("\n The total additional points score is" + additionalPoint);
		totalPointScore = additionalPoint + expScore + eduScore + ageScore + ieltsSCore;
		System.out.println("\n The total points score is  " + " " + totalPointScore);
		if (totalPointScore >= 67) {
			System.out.println("You are eligible to submit an expression Of interest to Immigration of Canada");

		} else {
			System.out.println("You are not eligible:");
		}
	}

}
