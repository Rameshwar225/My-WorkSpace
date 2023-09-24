package data_type_and_veriable;
import java.util.Scanner;

public class CBSC_percentage_calculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five subject marks: ");
		int m1 = sc.nextInt();
		int oop = sc.nextInt();
		int fds = sc.nextInt();
		int cg = sc.nextInt();
		int deld = sc.nextInt();
		
		float per =(m1+oop+fds+cg+deld)/5;
		System.out.println("your total percentage is: "+per);

	}

}
