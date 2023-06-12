package RocketProject;

import java.util.ArrayList;

public class RocketMain {

	public static void main(String[] args) {
		// Create an instance of R1 rocket

//		R1 r1Rocket = new R1();
//
//		// Create an instance of R2 rocket
//
//		R2 r2Rocket = new R2();
//
//		// Create an Item
//		Item item = new Item();
//		item.name = "Cargo 1";
//		item.weight = 5000;
//		// load the item into R1 rocket
//		if (r1Rocket.canCarry(item)) {
//			r1Rocket.carry(item);
//			System.out.println("Item loaded onto R1 rocket");
//		} else {
//			System.out.println("Item cannot be loaded onto R1 rocket--Weight limit exceeded");
//		}
//		// Launch and land R1 rocket
//		if (r1Rocket.launch() && r1Rocket.land()) {
//			System.out.println("R1 rocket mission sussessful");
//		} else {
//			System.out.println("R1 rocket mission failed");
//		}
//		// load the item into R1 rocket
//		if (r2Rocket.canCarry(item)) {
//			r2Rocket.carry(item);
//			System.out.println("Item loaded onto R2 rocket");
//		} else {
//			System.out.println("Item cannot be loaded onto R2 rocket--Weight limit exceeded");
//		}
//		// Launch and land R2 rocket
//		if (r2Rocket.launch() && r2Rocket.land()) {
//			System.out.println("R2 rocket mission sussessful");
//		} else {
//			System.out.println("R2 rocket mission failed");
//		}
		
		
	Simulation simulation=new Simulation();
	//load items
	ArrayList<Item>items=simulation.loadItems("C:\\Users\\santa\\OneDrive\\Desktop\\sucharita\\phase-1 (1).txt");
	
	//load a fleet of R1
	
	ArrayList<Rocket> fleetR1 =simulation.loadU1(items);
	
	//run the simulation with fleet R1 rockets and also display the budget
	int totalBudgetR1=simulation.runSimulation(fleetR1);
	System.out.println("The total budget of R1 rockets "+totalBudgetR1 );
	
ArrayList<Rocket> fleetR2=simulation.loadU2(items);
	
	//run the simulation with fleet R1 rockets and also display the budget
	int totalBudgetR2=simulation.runSimulation(fleetR2);
	System.out.println("The total budget of R2 rockets "+totalBudgetR2 );
	
	}

}
