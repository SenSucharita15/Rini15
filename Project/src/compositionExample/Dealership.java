package compositionExample;

public class Dealership {

	public String dealershipName;

	private Car[] carList = new Car[3];
	String[] nameList = new String[5];

	private double priceOfCar;

	private Truck[] trucklist = new Truck[3];

	public void addTruckToDealership(Truck[] truck) {
		for (int i = 0; i < trucklist.length; i++) {
			if (trucklist[i] == null) {

				trucklist[i] = truck[i];

				System.out.println(trucklist[i].getName());
				// break;
			}
		}
	}

	//@SuppressWarnings("unlikely-arg-type")
	public void getPriceForTruck(String truckName)
	{
		for (int i = 0; i < trucklist.length; i++) {
			if (trucklist[i] .getName().equals(truckName))
			
				
		
		System.out.println("The new price is "+ " "+trucklist[i].getPrice());
		}
		
				
	}
			
	public void addCarsToDealership(Car carBrought) {
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] == null) {
				carList[i] = carBrought;
				System.out.println(carList[i].getBrandName());
				break;
			}
		}
	}

	public void addCarsToDealership(Car[] carBrought) {
		for (int i = 0; i < carList.length; i++) {
			if (carList[i] == null) {
				carList[i] = carBrought[i];
				System.out.println(carList[i].getBrandName());
				// break;
			}
		}
	}

	double getPrice(String carName) {
		for (int i = 0; i < carList.length; i++) {
			if (carList[i].getBrandName().equals(carName)) {
				priceOfCar = carList[i].getPriceOfCar();
				break;
			}
		}
		return priceOfCar;
	}
}
