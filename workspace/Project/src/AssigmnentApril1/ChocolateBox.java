package AssigmnentApril1;

public class ChocolateBox {

	int initialChocolate = 27;
	int maxChocolate = 63;
	int count = 5;
	int remaining;

	void chocolateBox() {
		// for(int i=1;i<=10;i++)
		System.out.println(" The number of chocolates now are  " + "" + initialChocolate);
		do {
			initialChocolate = initialChocolate + count;

			if (initialChocolate >= maxChocolate) {
				System.out.println(" No more adding of 5 Chocolates, its reached limit " + "" + maxChocolate);
			} else {
				System.out.println(" The number of chocolates now are  " + "" + initialChocolate);
				int remaining = maxChocolate - initialChocolate;
				System.out.println(" The remaining space is " + "" + remaining);
				// initialChocolate=initialChocolate+remaining;

			}

		} while (initialChocolate < maxChocolate);

	}
}
