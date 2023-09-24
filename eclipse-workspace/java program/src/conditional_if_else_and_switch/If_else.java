package conditional_if_else_and_switch;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		if (marks >= 90) {
			System.out.println("You will get COEP clg");
		} else if (marks >= 80 && marks <= 90) {
			System.out.println("You Will get SVPM'S COE,Malegaon");
		} else {
			System.out.println("Your marks is too low ");
		}

	}

}
