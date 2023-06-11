package compositionExample;

public class Truck {
	private double price;
	private String name;
	private String color;
	private int seatCapacity;
	
	public Truck(double price, String name, String color,int seatCapacity) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
		this.seatCapacity=seatCapacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public String getColor() {
		return color;
	}
	
	
	
	
	 

}
