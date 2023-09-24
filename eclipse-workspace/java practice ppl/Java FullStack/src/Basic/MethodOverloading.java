package Basic;

import java.util.*;

public class MethodOverloading {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("Method with two rgument: " + m1(a, b));
		System.out.println();
		System.out.print("Method with one argument: " + m1(a));

	}

	public static int m1(int a, int b) {
		return a + b;
	}

	public static int m1(int a) {
		int b = 10;
		return a + b;
	}

}
