package Day2;

import java.util.*;
public class AlphabateOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Charater: ");
		char c = sc.next().charAt(0);
		
		if((c>=65 && c<=90) || (c>=97 && c<=122))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Not an Alphabet");
		}

	}

}
