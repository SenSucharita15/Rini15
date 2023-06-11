package assignmentInheritance;

import java.util.*;

public class MainInheritance {

	public static void main(String[] args) {

		// Person[] person = new Person[5];
		Person riniAccount = new Person("A11", "Rini", 1000.00, 1234, "PASSWORD1");
		Person rijuAccount = new Person("B11", "Riju", 2000.00, 1235, "PASSWORD2");
		Person rishiAccount = new Person("C11", "Rishi", 3000.00, 1236, "PASSWORD3");
		Person rimpiAccount = new Person("D11", "Rimpi", 3000.00, 1237, "PASSWORD4");
		Person riteshAccount = new Person("E11", "Ritesh", 4000.00, 1238, "PASSWORD5");

		Scanner sc = new Scanner(System.in);

	/*	Person selectedPerson = null;
		System.out.println("Available Account in the bank are as follow:\n ");
		/*
		 * for(int i=0;i<person.length;i++) {
		 * System.out.println(person[i].getAccountNo()+" \t "); }
		
		// Enhanced for loop
		for (Person p : person) {
			System.out.println(p.getAccountNo());
		}
		System.out.println("Enter the person account number to allow transaction");
		String accNo = sc.nextLine();
		for (int i = 0; i < person.length; i++) {

			if (person[i].getAccountNo().equals(accNo)) {
				selectedPerson = person[i];
				break;
			}
		}

		if (selectedPerson == null) {
			System.out.println("Invalid account number !   ");
			// return;
			System.exit(0);

		}
		// Using Enhanced for loop//

		
		 * for(Person p:person){ { if(p.getAccountNo().equals(accNo)) {
		 * selectedPerson=p; break; } } }
		 */

		System.out.println("Welcome to the BANK");

		System.out.println("\n Enter banking type \n 1 - ATM Banking \n 2 - Online Banking");
		int bankingType = sc.nextInt();

		BankOperation bop = null;

		if (bankingType == 1) {

//Using parent class refernce variable to assign the child class object.
			bop = new ATM(riniAccount, riniAccount.getPin());

			// bop = new ATM(person.getTotalFunds(), person.getPin());

			System.out.println(" 1. Change Passowrd/PIN  2.Login with current Pin /Password: \n Enter your choice");
			int choice = sc.nextInt();
			if (choice == 1) {
				bop.changePinPassword(riniAccount);

			} else
				// {

				System.out.println("  \n " + " Account holder name  " + riniAccount.getName());
			System.out.println(" \n " + " Account No: " + riniAccount.getAccountNo());
			bop.performTransaction();

			// }
		} else if (bankingType == 2) {
			// Creating an object of parent class
			// with reference to child class
			bop = new OnlineBanking(riniAccount, riniAccount.getOnlineBankingPassword());

			System.out.println(" 1. Change Passowrd  2.Login with current Pin /Password: \n Enter your choice");
			int choice = sc.nextInt();
			if (choice == 1) {
				bop.changePinPassword(riniAccount);

			} else

				System.out.println("  \n " + " Account holder name  " + riniAccount.getName());
			System.out.println(" \n " + " Account No: " + riniAccount.getAccountNo());

			bop.performTransaction();
		} else {
			System.out.println("Invalid Banking TYpe:select the correct type from the above menu");
		}

	}

}
