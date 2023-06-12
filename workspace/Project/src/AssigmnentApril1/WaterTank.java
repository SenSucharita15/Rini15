package AssigmnentApril1;

import java.util.Scanner;

public class WaterTank {

	int waterTankCapacity = 100;
	int bucketCapacity = 10;
	//int waterInTank ;

	void waterTankCapacity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the water level");
		int waterInTank=sc.nextInt();
		System.out.println("Start to fill the tank with a bucket of Maximum 10 litre only  ");

		while (waterInTank < waterTankCapacity) {
			System.out.println("\n The tank now has " + "" + waterInTank + " litre of water\n");
			System.out.println("Enter the litres of water to  add, Maximum 10 litres\n");
			int waterAdd = sc.nextInt();

			if (waterAdd <= 0) {
				System.out.println("\n Invalid entery:Please enter valid number");
			} else if (waterAdd > 10) {
				System.out.println("Maximum Capacity of bucket 10 litres:Fill lesser amount:Not exceed 10 ");
			} else if ((waterInTank + waterAdd) > waterTankCapacity)

			{
				System.out.println("Water Tank will overflow:Add less water");
				// break;if we take waterInTank<=waterTankCapacity ,use break here to check
				// break;it will come out of the loop if break is used

			} else {
				waterInTank = waterInTank + waterAdd;
				System.out.println("\n  The amount of water added now is" + "" + " " + waterAdd + " " + "litres");
				// System.out.println("\n The water now is tank "+ waterInTank);To see the
				// curret water amount in tank
				// System.out .println("Enter the litres of water to add, Maximum 10 litres\n");

			}
			// break;
		}
		System.out.println("\n The tank is full now" + " " + waterInTank + " litres ");
		System.out.println("\n No more adding of water:Thank You");

	}
}
