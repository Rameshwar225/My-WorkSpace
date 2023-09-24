package conditional_if_else_and_switch;

import java.util.Scanner;

public class Income_calculator {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary");
		int salary = sc.nextInt();
		if(salary<250000)
		{
			System.out.println("there is no any tax for that salary which is below 2.5L");
		}
		else if (salary >= 250000 && salary <= 500000) {
			int tax = (5 * salary) / 100;
			int total_salary = salary - tax;
			System.out.println("Your total salary is: " + total_salary);

		} else if (salary > 500000 && salary <= 1000000) {
			int tax1 = (5 * salary) / 100;
			int total_salary1 = salary - tax1;

			System.out.println("Your total salary is: " + total_salary1);
		} else {
			int tax2 = (5 * salary) / 100;
			int total_salary2 = salary - tax2;
			System.out.println("your total salary is: " + total_salary2);
		}
	}

}
