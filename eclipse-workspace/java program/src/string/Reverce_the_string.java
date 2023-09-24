package string;

import java.util.Scanner;

public class Reverce_the_string {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string");
         String input = sc.nextLine();
         
         StringBuilder output = new StringBuilder();
         
         String str[]  = input.split("\\s");
         
         for(int i = str.length-1;i>=0;i--)
         {
        	 output.append(str[i]);
        	 output.append(" ");
         }
         System.out.println(output);

	}

}
