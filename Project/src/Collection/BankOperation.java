package Collection;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class BankOperation {

	public void validatePin(PersonDetails person, int enteredPin)

	{

		if (person.getPinnNumber() == enteredPin) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Invalid Pin");
		}
	}

}
