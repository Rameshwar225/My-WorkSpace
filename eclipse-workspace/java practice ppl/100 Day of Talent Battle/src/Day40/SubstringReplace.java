package Day40;

import java.util.Scanner;

public class SubstringReplace {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");

		String str = sc.nextLine();

		System.out.print("Enter the string to be removed: ");

		String sub = sc.nextLine();

		System.out.print("Enter the new string: ");

		String newstr = sc.nextLine();

		String repstr = str.replace(sub, newstr);

		System.out.println("New String is :" + repstr);

	}

}
