package PracticeInterview;

import java.util.Scanner;

public class Check10PrimeNumbers {

	int n;

	void primeNumbers() {
		// int limit = 100;
		int limit;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the limit");
		limit = sc.nextInt();

		System.out.println("Prime numbers limit " + limit);

		// loop through the numbers one by one
		for (int i = 3; i < limit; i++) {

			boolean isPrime = true;

			// check to see if the number is prime
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			// print the number
		//	while(count<10)
			//{
			if (isPrime) {

				System.out.print(i + " " );
				}
				// }

	
		}
	}
}




// System.out.println("Count is"+count);

// }
