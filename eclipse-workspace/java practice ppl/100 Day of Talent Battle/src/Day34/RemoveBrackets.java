package Day34;

import java.util.Scanner;

public class RemoveBrackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		String output = s1.replaceAll("[()]", "");
		System.out.println(output);
		

	}

}
