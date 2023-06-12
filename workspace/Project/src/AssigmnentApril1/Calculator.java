package AssigmnentApril1;

import java.util.Scanner;

public class Calculator {

//	 void calculateSquareAndCube() {

	// int num1;
	// int num2;
	Scanner s = new Scanner(System.in);

	int num1;
	int num2;

	void sumOfNumbers() {

		System.out.println("enter the   numbers");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
	}

	void differenceOfNumbers() {

		System.out.println("enter the   numbers");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int difference = num1 - num2;
		System.out.println("Difference of " + num1 + " and " + num2 + " is " + difference);
	}

	void productOFNumbers() {
		System.out.println("enter the   numbers");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int product = num1 * num2;
		System.out.println("Product of " + num1 + " and " + num2 + " is " + product);
	}

	void divisionOfNumbers() {
		System.out.println("enter the   numbers");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int quotient = num1 / num2;
		System.out.println("Quotient of " + num1 + " and " + num2 + " is " + quotient);
		int remainder = num1 % num2;
		System.out.println("Remainder of the division operation of " + num1 + " and " + num2 + " is " + remainder);
	}

	void squareOfNumbers() {
		System.out.println("enter the   number");
		int num1 = s.nextInt();
		// int num2=s.nextInt();
		int square = num1 * num1;
		System.out.println("square of " + num1 + "is  " + square);

	}

	void cubeOfNumbers() {

		System.out.println("enter the   number");
		int num1 = s.nextInt();
		// int num2=s.nextInt();
		int cube = num1 * num1 * num1;
		System.out.println("Cube of  " + num1 + " is  " + cube);
	}
}
