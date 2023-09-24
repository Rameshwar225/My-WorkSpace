package loop_control_instruction;

import java.util.Scanner;

public class Factorial_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number");
		int n = sc.nextInt();
		int fact = 1; // if we need to find factorial above 10(upto 20) then you need to replace int
						// to long
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

}
