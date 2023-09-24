package Day1;

import java.util.*;

public class Volel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char a = sc.next().charAt(0);
		if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
			if (a == 65 || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O'
					|| a == 'U') {
				System.out.println("Vowel");
			} else {
				System.out.println("Consonant");
			}
		} else {
			System.out.println("Invalid Input");
		}

	}

}
