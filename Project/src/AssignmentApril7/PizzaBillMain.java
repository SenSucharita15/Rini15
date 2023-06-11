package AssignmentApril7;

import java.util.*;

public class PizzaBillMain {

	public static void main(String[] args) {
		// String choice;
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		PizzaBillPayment pizza = new PizzaBillPayment();
		pizza.getPizzaSize();
		// System.out.println("The pizza selected is"+ choice);

		double price = pizza.wantExtraPepperoni();
		System.out.println("The pizza price is" + price);
		double price1 = pizza.getExtraCheese();
		System.out.println("The Total pizza price is" + price1);
		
		//System.out.println("Do you want to continue order 1.YES 2.NO");
		//int choice1 = sc.nextInt();
		boolean exit = false;
		while (!exit) {
			System.out.println("Do you want to continue order 1.YES 2.NO");
			int choice1 = sc.nextInt();
			switch (choice1) {

			case 1:

				pizza.getPizzaSize();
				double price11 = pizza.wantExtraPepperoni();
				System.out.println("The pizza price is" + price11);
				double price111 = pizza.getExtraCheese();
				System.out.println("The Total pizza price is" + price111);
				break;

			case 2:

				exit = true;
				System.out.println("THANK YOU");
				break;

			default:
				 {
				System.out.println("Invalid Entry");
				break;
		
			}
			}
		}
	}
}
