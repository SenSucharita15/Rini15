package assignmentApril15;

import java.util.Scanner;
import java.util.HashMap;

public class PhonePlanSelection {
	Scanner input = new Scanner(System.in);
	private String price1;

	String selectPhoneModel(String os) {
		String[] samsung = { "S22", "S22+", "S22 Ultra", "S22 FE" };
		// int [] samsungTab= {25,35,55,20};
		String[] apple = { "Iphone 14", "Iphone 14 pro", "Iphone 14 Pro max", "Iphone 14 Mini" };

		String[] model;

		if (os.equals("SAMSUNG")) {
			model = samsung;

		} else
			model = apple;
		System.out.println("Please select the model from the following:");
		for (int i = 0; i < model.length; i++) {
			System.out.print((i + 1) + "   " + model[i] + "\n");
		}

		// Scanner input = new Scanner(System.in);
		String index = input.nextLine();
		String selectModel = index;
		return selectModel;
	}

	String selectPlan() {
		Scanner input = new Scanner(System.in);
		System.out.println("Select a plan from the following:");
		System.out.println("1.Rogers :70$/month");
		System.out.println("2.Bell :80$/month");
		System.out.println("3.Telus :75$/month");

		int plan = input.nextInt();
		String selectPlan;

		switch (plan) {
		case 1:
			selectPlan = "Rogers";
			break;

		case 2:
			selectPlan = "Bell";
			break;

		case 3:
			selectPlan = "Telus";
			break;

		default:
			selectPlan = "Inavalid selection";
			break;

		}
		return selectPlan;

	}

	double calculatePrice(String selectModel, String selectPlan) {
		HashMap<String, Double> tabMap = new HashMap<String, Double>();
		// using HashMap here to store the key-value pairs //
		// Without it using switch case will create use of repeated lines 8 times //
		tabMap.put("S22", 25.0);
		tabMap.put("S22 +", 35.0);
		tabMap.put("S22 Ultra", 55.0);
		tabMap.put("S22 FE", 20.0);
		tabMap.put("Iphone 14", 30.0);
		tabMap.put("Iphone 14 pro", 40.0);
		tabMap.put("Iphone 14 pro max", 65.0);
		tabMap.put("Iphone 14 Mini", 25.0);
		double tab = tabMap.get(selectModel);
		System.out.println("The monthly tab is " + tab);

		HashMap<String, Double> planMap = new HashMap<String, Double>();

		planMap.put("Rogers", 70.0);
		planMap.put("Bell", 80.0);
		planMap.put("Telus", 75.0);

		double plan = planMap.get(selectPlan);
		System.out.println("The monthly Payment plan  is " + plan);
		return tab + plan;
	}
}