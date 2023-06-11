package AssigmnentApril1;

import java.util.*;

public class Login {

	String Myusername = "User1";
	String Mypassword = "Pass123#";
	int attempt = 0;

	void Takeinput() {
//	String Myusername="User1";
		// String Mypassword="Pass123#";

		// {

		Scanner scanner = new Scanner(System.in);
		while (attempt < 3) {
			System.out.println("Please enter Username");
			String inputUsername = scanner.nextLine();
			System.out.println("Please enter Password");
			String inputPassword = scanner.nextLine();

			{
				if (inputUsername.equals("") || inputPassword.equals("")) {
					System.out.println("Username or password is Blank. Please enter valid input");
				}

				else if (!inputUsername.equals(Myusername)) {
					System.out.println("Invalid UserName...Try Again...\n");
				} else if (!inputPassword.equals(Mypassword)) {
					System.out.println("Invalid Password...Try Again...\n");
				}

				else {
					System.out.println(" You have logged in successfully\n");
					break;
				}
				attempt++;
			}
			if (attempt == 3)
				System.out.println(" ***Account is locked***");
		}
	}
}
