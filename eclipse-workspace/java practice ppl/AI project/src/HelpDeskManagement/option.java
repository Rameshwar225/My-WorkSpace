package HelpDeskManagement;

import java.util.Scanner;

public class option{
	

	public option()
	{
		
		System.out.println();
		System.out.println("1. Money withdrawl probelm");
		System.out.println("2. Money debitated but not get");
		System.out.println("3. Money not get credidate");
		System.out.println("4. Atomatic debited");
		System.out.println("5. Change ATM pin");
		System.out.println("6. Other problem");
		System.out.println("7. Exit");
		System.out.println();
		System.out.println("Your option? ");
		// Get user input
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		// Execute selected option
		switch (choice) {
		case 1:
			new MoneyWithdrol();
			break;
		case 2:
			new MoneyDebited();
			break;
		case 3:
			new NotGetCreated();
			break;
		case 4:
			new AtometicDebited();
			break;
		case 5:
			new changeAtmPin();
			break;
		case 6:
			new OtherProblem();
			break;
		case 7:
			System.out.println("Exiting program...");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice. Please try again.");
			break;
		}
	
}
}
	
