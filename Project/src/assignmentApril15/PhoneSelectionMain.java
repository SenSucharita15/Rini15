package assignmentApril15;

import java.util.Scanner;

public class PhoneSelectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhonePlanSelection phone = new PhonePlanSelection();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the type of phone you want(SAMSUNG/APPLE)");
		String os = input.nextLine();
		String selectModel = phone.selectPhoneModel(os);
		String selectPlan = phone.selectPlan();
		//
		double price = phone.calculatePrice(selectModel, selectPlan);
		// int selectTab=phone.selectTab();

		// System.out.println("You have selected the following:");
		// System.out.println("OS:"+ os);
		System.out.println("Phone Model:" + selectModel);
		System.out.println("Phone is:" + os);
		System.out.println("Plan:" + selectPlan);
		System.out.println("Total Monthly amount is $" + price);

	}

}
