package Day28;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str = sc.nextLine();
		String newString = str.replaceAll(" ", "");
		System.out.println(newString);
		
		for(int i =(newString.length()-1); i>=0;--i)
		{
			System.out.print(newString.charAt(i));
		}

	}

}
