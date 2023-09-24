package Whle_loops;

import java.util.Scanner;

public class Palimdrom_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int revercedNumber = 0;
		while (temp > 0) {
			int lastdigit = temp % 10;
			revercedNumber = revercedNumber * 10 + lastdigit;
			temp /= 10;
		}

		if (revercedNumber == n) {
			System.out.println("number is palimdrom");
		} else {
			System.out.println("number is not palimdrom");
		}

	}

}
