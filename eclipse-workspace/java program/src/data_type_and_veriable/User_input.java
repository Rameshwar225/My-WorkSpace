package data_type_and_veriable;
import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String my = sc.nextLine(); //it is use for string input 
		System.out.println("enter the value of x");
		int x = sc.nextInt();  //it is use for int input
		System.out.println("Enter the value of a");
		byte a = sc.nextByte(); //it is use for byte input
		System.out.println("Enter the value of y ");
		float y = sc.nextFloat(); // it is use for float input
		System.out.println("Enter the value of z ");
		double z = sc.nextDouble(); //it is use for double input
		
		
		System.out.println(x);
		
		System.out.println(y);
	
		System.out.println(z);
		
		System.out.println(a);
		
		System.out.println(my);
		
		
	}

}
