package Firstprojecct;

public class FirstprojectMain {

	public static void main(String[] args) {
		// TODO Auto-generate method stub
	System.out.println("SUCHARITA's  first program in java")	;
		
		
    Student s1=new Student();
    s1.roll_number=10;
    s1.name="Rahul";
    s1.marks=75.5;
    s1.age=19;
    System.out.println("The details of the student is given below");
    s1.getroll();
    s1.getname();
    s1.getmarks();
    s1.age();
    
  System.out.println("The details of the travel company ");
      Travel Costco=new Travel();
     Costco.Name = "COSTCO";
	Costco.contact=1234;
	Costco.address ="Brampton";
	//Costco.price =
    Costco.get_info_flight();
	Costco.get_info_hotel();
	Costco.get_info_tour();
	
	System.out.println("*******************************");
		}

}
