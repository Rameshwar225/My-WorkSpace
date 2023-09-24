package practice_examples;

import java.util.Scanner;

public class Simple_calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter first number: ");
		int a = sc.nextInt();
		System.out.println("Eneter second number: ");
		int b = sc.nextInt();
		System.out.println("the sum of number is: " + (a + b));
		System.out.println("the substraction of two number is: " + (a - b));
		System.out.println("the multiplication of two number: " + a * b);
		System.out.println("the division of two number is: " + a / b);
		System.out.println("the reminder of two number is: " + a % b);

	}

}
