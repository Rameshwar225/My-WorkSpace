package Day32;

import java.util.Scanner;

public class RemoveOvelsFromString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s1 = sc.nextLine();
		String output = s1.replaceAll("[AEIOUaeiou]", "");
		System.out.println(output);
		

	}

}
