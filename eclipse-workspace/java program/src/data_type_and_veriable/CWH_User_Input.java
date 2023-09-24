package data_type_and_veriable;
import java.util.Scanner;

public class CWH_User_Input {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		float b = sc.nextFloat();
		float sum =a+b;
		System.out.print("The sum of two number is: ");
		System.out.println(sum);
		
		
		
	}

}
