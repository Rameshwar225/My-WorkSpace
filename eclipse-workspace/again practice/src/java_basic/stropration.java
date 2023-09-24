package java_basic;
import java.util.Scanner;
public class stropration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string");
		String str1 = sc.nextLine();
		System.out.println("Enter 2nd string");
		String str2 = sc.nextLine();
		//for length of string
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		System.out.println("is both string are same? "+str1.equals(str2));
		
		System.out.println("character at 2nd position: "+str1.charAt(2));
		System.out.println("charactrer at 3rd position: "+str2.charAt(3));
		
		

	}

}
