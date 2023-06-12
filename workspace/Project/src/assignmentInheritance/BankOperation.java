package assignmentInheritance;

import java.util.*;

abstract public class BankOperation {

	//private double balance;
//	String name;

	public BankOperation() {
	//	this.balance = balance;

	}

	public void withdraw(Person person,double amount) {
		if (amount > 0 && amount<person.getBalance()) 
			//balance = balance - amount;
			System.out.println("collect cash"+ amount);
		
//			System.out.println("Withdraw successful.Balance:" + balance);
//		} else {
//			System.out.println("Invalid amount or not sufficient balance");
//		}
		person.setBalance(person.getBalance()-amount);
		System.out.println("Balance available" );
		System.out.println("Deposit successful.Balance:" + person.getBalance());
		

	}

	public void deposit(Person person,double amount) {
		if (amount > 0) {
		//	balance = amount + balance;
			person.setBalance(person.getBalance()+amount);
			System.out.println("Deposit successful.Balance:" + person.getBalance());
		}

		else

		{
			System.out.println("Invalid amount or not sufficient balance");
		}

	}

	public void viewBalance(Person person) {
		System.out.println("  Balance:" +person.getBalance() );
	}

	public abstract void performTransaction();
//	{
//		System.out.println("Welcome to the Bank: operations available:1. ATM  2.Online Banking");
//	}

	public abstract void changePinPassword(Person p);
}
