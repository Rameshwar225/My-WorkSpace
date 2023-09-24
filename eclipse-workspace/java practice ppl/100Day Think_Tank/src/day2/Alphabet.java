package day2;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the charater");
		char alpha = sc.next().charAt(0);
		if(alpha>=65 && alpha<=122) 
		{
			System.out.println("Alphabets");
		}
		else
		{
			System.out.println("Not an alphabtes");
		}
		

	}

}
