package Basic;

import java.util.*;

public class PrimeNumberUsingMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();

		if (m(a) == true) {
			System.out.println(a + " is prime");
		} else {
			System.out.println(a + " is not prime");
		}

	}

	public static boolean m(int a) {
		int temp;
		boolean isPrime = true;
		for (int i = 2; i < a; i++) {
			temp = a % i;
			if (temp == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			return true;
		} else {
			return false;
		}
	}

}
