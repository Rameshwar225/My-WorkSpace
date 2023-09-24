package java_basic;
import java.util.Scanner;
public class Mathematical_opration {

	public static void main(String[] args) {
		System.out.println("Arithmetic operation");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("**********MENU**********");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulous");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Addition of two number is: "+ (a+b));
			break;
		case 2:
			System.out.println("Substraction of two number is: "+ (a-b));
			break;
		case 3:
			System.out.println("Multiplication of two number is: "+ (a*b));
			break;
		case 4:
			System.out.println("Division of two number is: "+ (a/b));
			break;
		case 5:
			System.out.println("Modulus: "+(a%b));
			break;
		case 6:
			System.out.println(exit(0));
			break;
	     
			
		}
		
		
		
	
		
       
		
	
	}

	private static char[] exit(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}


	
	
	
	
	
	
	
	
	
