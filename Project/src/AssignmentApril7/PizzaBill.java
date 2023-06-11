package AssignmentApril7;

import java.util.Scanner;

public class PizzaBill {
	double bill;
	double finalbill = 0;
	double price;
	int choice;
	Scanner sc = new Scanner(System.in);

	void finalpayment() {
		finalbill = finalbill + bill;
		System.out.println(" The payment due is " + " " + finalbill);
	}

	void smallPizza() {
		double price = 15;
		System.out.println("The price for only cheese pizza is " + price);
		System.out.println("DO you want extra pepperoni toppings :1.YES 2.NO");
		choice = sc.nextInt();
		// Object YES = null;
		if (choice == 1) {
			price = price + 2;
			bill = price;
			System.out.println("The bill is " + bill);
			// break;

		} else {
			bill = price;
			System.out.println("The  bill now  is" + bill);
		}
		System.out.println("DO you want extra Cheese :1. YES 2.NO");
		choice = sc.nextInt();
		if (choice == 1) {
			price = price + 1;
			bill = price;
			System.out.println("The bill now  is " + bill);
		} else
		// else
		{
			bill = price;
			System.out.println("The  bill now is" + bill);
		}

	}

	void mediumPizza() {
		double price = 20;
		System.out.println("The price for only cheese pizza is " + price);
		System.out.println("DO you want extra pepperoni toppings :1.YES 2.NO");
		choice = sc.nextInt();
		// Object YES = null;
		if (choice == 1) {
			price = price + 3;
			bill = price;
			System.out.println("The bill is " + bill);
			// break;

		} else {
			bill = price;
			System.out.println("The  bill now  is" + bill);
		}
		System.out.println("DO you want extra Cheese :1. YES 2.NO");
		choice = sc.nextInt();
		if (choice == 1) {
			price = price + 1;
			bill = price;
			System.out.println("The bill is " + bill);
		} else {
			bill = price;
			System.out.println("The  bill now  is" + bill);
		}
	}

	void largePizza() {
		double price = 25;
		System.out.println("The price for only cheese pizza is " + price);
		System.out.println("DO you want extra pepperoni toppings :1.YES 2.NO");
		choice = sc.nextInt();
		// Object YES = null;
		if (choice == 1) {
			price = price + 3;
			;
			System.out.println("The price is " + price);
			// break;

		} else {
			bill = price;
			System.out.println("The  bill now  is" + " " + bill);
		}

		System.out.println("DO you want extra Cheese :1. YES 2.NO");
		choice = sc.nextInt();
		if (choice == 1) {
			price = price + 1;
			bill = price;
			System.out.println("The price is " + price + "and the bill is" + bill);
		} else {
			bill = price;
			System.out.println("The  bill now  is" + " " + bill);
		}

	}

}
