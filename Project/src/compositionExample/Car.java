package compositionExample;

public class Car {
	private String brandName;
	private String color;
	private int seatingCapacity;
	private double priceOfCar;
	
	   public Car(String brandName, String color,int seatingCapacity, double priceOfCar)
	   {
		   super();
		   this.brandName=brandName;
		   this.color=color;
		   this.seatingCapacity=seatingCapacity;
		   this.priceOfCar=priceOfCar;
		   
	   }

	public double getPriceOfCar() {
		return priceOfCar;
	}

	public void setPriceOfCar(double priceOfCar) {
		this.priceOfCar = priceOfCar;
	}

	public String getBrandName() {
		return brandName;
	}

	public String getColor() {
		return color;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	   
	   
	  
}
