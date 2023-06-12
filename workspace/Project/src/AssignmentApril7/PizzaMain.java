package AssignmentApril7;

import java.util.Scanner;

public class PizzaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaBill pizza = new PizzaBill();
		boolean exit = false;
		double finalbill;
		// pizza.smallPizza();
		Scanner sc = new Scanner(System.in);

		System.out.println("WELCOME TO THE PIZZA SHOP");
		System.out.println("Please enter the name of the customer");
		String name = sc.nextLine();

		System.out.println("WELCOME TO THE PIZZA SHOP" + " " + name);
		// int select=sc.nextInt();
		// System.out.println("Enter : 1: Small Cheese Pizza, 2:Medium Cheese
		// Pizza,3:Large Cheese Pizza 4.Exit");
		// int select=sc.nextInt();
		// System.out.println("Your option is "+" "+ select);

		while (!exit) {
			System.out.println(
					"\r Enter an option from the following : 1: Small Cheese Pizza, 2:Medium Cheese Pizza,3:Large Cheese Pizza 4.Exit. 5 Payment");
			int select = sc.nextInt();
			System.out.println("Your option selected is " + " " + select);

			// System.out.println("Enter an option from the following : 1: Small Cheese
			// Pizza, 2:Medium Cheese Pizza,3:Large Cheese Pizza 4.Exit");
			// int select=sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("Creating order for" + "  " + name + " " + "Small Pizza");
				pizza.smallPizza();
				break;
			case 2:
				System.out.println("Creating order for" + " " + name + " " + "Medium Pizza");
				pizza.mediumPizza();
				break;

			case 3:
				System.out.println("Creating order for" + " " + name + " " + "Large Pizza");
				pizza.largePizza();
				break;

			case 4:
				exit = true;

				break;

			case 5:
				pizza.finalpayment();
				break;

			default:

				System.out.println("Invalid number option : Try a valid number option");

				break;

			}

		}
		// pizza.finalpayment();
		// finalbill=finalbill+bill;
		// System.out.println("The payment due is"+" "+finalbill);
		System.out.println("THANK YOU");

	}
}
