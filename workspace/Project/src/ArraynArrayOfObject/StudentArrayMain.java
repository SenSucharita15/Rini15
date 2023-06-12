package ArraynArrayOfObject;

import java.util.*;

public class StudentArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	StudentArray[] student;
		// student=    new StudentArray[3];
		 Scanner Sc=new Scanner(System.in);
		 
		 StudentArray[] student= {
		new StudentArray("Raj",1,"Male",60,12),
		
		new StudentArray("Ravi",2,"Male",62,13),
		new StudentArray("Rahul",3,"Male",65,14),
		 };
		
		System.out.println("Enter the Student name whose details you want");
		
		//int mark1=Sc.nextInt();
		
//		student[0].setMarks(70);
	String name=Sc.next();
//		
		for(int i=0;i<student.length;i++)
		{
		if(student[i].getName().equals(name))
			
		{
			System.out.println("Marks is "+student[i].getMarks());
			System.out.println(" enter the updated  marks of student to set");
			
			int newMark=Sc.nextInt();
			student[i].setMarks(newMark);
			
			System.out.println("Roll no is "+student[i].getRoll());
			System.out.println("Gender is "+student[i].getGender());
			System.out.println("Marks is "+student[i].getMarks());
			System.out.println("Student no is "+student[i].getStudentNo());
		}
		}
		
		

	}

}
