package interviewJavaPrograms;

import java.util.*;

public class PrimeNumber {

	int number;
	Scanner sc = new Scanner(System.in);
	boolean flag = true;

	boolean checkPrimeNumber(int num) {
		if (num <= 1) {
			// System.out.println("Not a prime number");
			return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				// System.out.println("Not a prime number");
				// flag=false;
				// break;
				return false;
			}

		}

		return true;
	}

	void printPrimeNumber() {
		int start = 1;
		int end = 30;
		//boolean flag = true;

		System.out.println("The range is " + start + " " + end);
		
		for (int i = start; i <= end; i++) {
			boolean flag = true;
			if(i<=1)
			{
				flag=false;
				
			}
			else {
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
						flag=false;
					break;
				}
			}
                          
			if (flag) {
				System.out.println(" "+i + " ");
			}
		}

	}

	void checkPrimeNumber() {

		System.out.println("Enter the number to be checked as prime or not");
		number = sc.nextInt();
		if (number <= 1) {
			System.out.println("Not a prime number");
			// return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				// System.out.println("Not a prime number");
				flag = false;
				break;
			}

		}
		if (flag) {
			System.out.println(" Number is prime number" + number);
		} else {
			System.out.println(" Number is not a prime number " + number);
		}
	}
}