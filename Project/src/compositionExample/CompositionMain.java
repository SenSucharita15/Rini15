package compositionExample;
import java.util.Scanner;

public class CompositionMain {

	public static void main(String[] args) {
		
	Car Civic=new Car("Honda","black",5,2000);
	Car Corolla=new Car("toyota","white",5,25000); 
	Car seltos=new Car("KIA","white",5,25000);
//		
		
		
		Dealership dealer=new Dealership();
		Dealership dealer1=new Dealership();
	dealer.addCarsToDealership(Corolla);
dealer.addCarsToDealership(Civic);
  Car[]carList= {
	   	     new Car("Honda","black",5,2000),
            new Car("toyota","white",5,25000), 
              new Car("KIA","white",5,25000)
  };
		

	Scanner sc=new Scanner(System.in);
	Car[]carlist=new Car[] {Civic,Corolla,seltos};
	
  Truck[] truckList= {
		  new Truck(5,"RAM","black",30000),
		  new Truck(5,"Ford","white",35000),
		  new Truck(5,"Mercedez","white",32000)
  };
	dealer1.addTruckToDealership(truckList);
	System.out.println("Enter the truck name who price need to be set again");
	String truckName=sc.nextLine();
	   for(int i=0;i<truckList.length;i++)
	   {
		   if(truckList[i].getName().equals(truckName))
		   {
			   truckList[i].setPrice(35000);
		   }
	   }
	   
	   dealer1.getPriceForTruck(truckName);
	
		dealer1.addCarsToDealership( carList);
		
		System.out.println("Enter the car name whose details need to be checked");
		String carName=sc.next();
		double priceOfCar=dealer.getPrice(carName);
		System.out.println("Price of car is"+ priceOfCar);
	}

}
