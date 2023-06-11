package Operators;

public class Arithoperator {
	int num1;
	int num2;
	
	
	void add()
	{
		 int sum=num1+num2;
		 System.out.println("the sum is " + sum );
		 
	}

	void sub() { 
		int diff=num1-num2;
		 System.out.println("the differnce is " + diff );
		 
	} 
	void product() { 
		int prod=num1*num2;
		 System.out.println("the product  is " + prod );
	}
	void divide() { 
		int quotient=num1/num2;
		 System.out.println("the quotient  is " + quotient );
		int remainder=num1%num2;
		 System.out.println("the remainder  is " + remainder);
	}	 
}
