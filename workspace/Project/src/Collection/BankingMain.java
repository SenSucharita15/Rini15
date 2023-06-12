package Collection;

import java.util.*;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class BankingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);

		PersonDetails riniAccount = new PersonDetails("Rini", "A34567", 1234);
		PersonDetails rimpiAccount = new PersonDetails("Rimpi", "34567", 1235);
		PersonDetails riteshAccount = new PersonDetails("Ritesh", "A34567", 1236);
		PersonDetails rajeshAccount = new PersonDetails("Rajesh", "C34567", 1237);

		// BankOperation bop=new BankOperation();

		BankOperation bop = new BankOperation();

		PersonDetails[] person = { riniAccount, rimpiAccount, riteshAccount };

		// changing array to arraylist

		List<PersonDetails> personList = new ArrayList<>(Arrays.asList(person));
		personList.add(rajeshAccount);

		PersonDetails selectPerson = null;
		System.out.println("Enter the person name who pin need to be validated");
		for (PersonDetails p : personList) {
			System.out.println(p.getName());
		}
		String name = sc1.nextLine();

		for (PersonDetails p : person) {
			if (p.getName().equals(name))
				selectPerson = p;
		}

		System.out.println("Enter the pin");
		int pin = sc1.nextInt();
		bop.validatePin(selectPerson, pin);

		List<String> nameList = new ArrayList<String>();
		nameList.add("Raj");
		nameList.add("Rithik");
		nameList.add("Rahul");
		nameList.add("Ravi");

		for (String n : nameList) {
			System.out.println(n);
		}
		nameList.add("Raja");
		System.out.println(nameList.toString());
		// nameList.remove(0);
		System.out.println("Enter the name you want to remove");
		// Scanner sc1=new Scanner(System.in);
		String enteredName = sc1.next();
		int index1 = nameList.indexOf(enteredName);

		String removeName = nameList.get(index1);
		System.out.println(removeName);
		// for (int i = 0; i < nameList.size(); i++) {
		// if (enteredName.equals(nameList.get(i))) {
		// nameList.remove(i);

		// }
		// System.out.println(nameList.toString());

		// }
		if (index1 != -1)

		{
			nameList.remove(index1);
			// }
			System.out.println(nameList.toString());
		} else {
			System.out.println("Name not found");
		}

		System.out.println("Enter the name you want to replace");

		String replaceName = sc1.next();
		int index = nameList.indexOf(replaceName);
		if (index != -1) {
			nameList.set(index, "John");
			System.out.println("Array after replacing is ");
			System.out.println(nameList.toString());
		} else {
			System.out.println("Name not found");
		}

		// Change from arraylist to array

		var newArray = nameList.toArray();

		System.out.println(Arrays.toString(newArray));
	}

}
