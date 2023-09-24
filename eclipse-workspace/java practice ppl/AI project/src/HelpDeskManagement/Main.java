package HelpDeskManagement;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name = input.nextLine();
		System.out.println("**********WELCOME "+name.toUpperCase() + " TO OUR HELP DESK OF OUR BANK**********");
		
		System.out.println();
		
		
		new option();


		}


	}

