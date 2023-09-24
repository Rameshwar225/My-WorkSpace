package pattern_printing_using_for_loop;

import java.util.Scanner;

public class Pattern_practice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int i, j;
		for (i = 0; i <= n; i++) {
			for (j = n; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
