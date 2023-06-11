package AssigmnentApril1;

import java.util.Scanner;

public class CheckIsPrime {

	Scanner sc = new Scanner(System.in);
	// int number;
	// System.out.println("Enter an integer number");

	void checkPrime() {

		System.out.println("Enter a integer number");
		int number = sc.nextInt();
		boolean isPrime = true;
		if (number < 2) {
			isPrime = false;
			System.out.println("Enter another integer number other than 0 or 1");
			// break;

		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println("The number is prime number");
		} else {
			System.out.println("The number is not prime number");
		}
	}
}
