package Main;

import java.util.Scanner;

public class option{
	

	public option()
	{
		
		System.out.println();
		System.out.println("1. Fees of College");
		System.out.println("2. Placement of college");
		System.out.println("3. Achievemnts of College");
		System.out.println("4. Number of company visited");
		System.out.println("5. Number of branches and names");
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
			new Fees();
			break;
		case 2:
			new placement();
			break;
		case 3:
			new Achievments();
			break;
		case 4:
			new companyvisited();
			break;
		case 5:
			new branch();
			break;
		case 6:
			new otherproblem();
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
	