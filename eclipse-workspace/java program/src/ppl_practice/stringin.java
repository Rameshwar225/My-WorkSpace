package ppl_practice;

import java.util.Scanner;
import java.util.*;



public class stringin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		String a = sc.nextLine();
		System.out.println(a);
	    System.out.println("operation on string");
	    System.out.println("1.find the lenght of string=");
	    System.out.print(a.length());
	    System.out.println("2.copare string");
	    System.out.println("enter string: ");
	    String b = sc.nextLine();
	    System.out.println(a.equals(b));
	    System.out.println("extract character from string");
//	    char R = 3;
		System.out.println(a.replace("a","z"));
	    
		

	}

}
