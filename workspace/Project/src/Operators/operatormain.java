package Operators;

public class operatormain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithoperator a1=new Arithoperator();
		a1.add();
		a1.num1=3;
		a1.num2=4;
		a1.add();
		a1.sub();

		a1.num1=7;
		a1.num2=3;
		a1.add()	;
		a1.sub();
		a1.product();
		a1.divide();
		//System.out.println("the quotient  is " + quotient);

		assignmentoperator a2= new assignmentoperator();
		a2.addequalto();
		a2.minusequalto();
		a2.square();
	}

}
