package Basic;
import java.util.*;
public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers: ");
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		System.out.println("the addition of these two number is: "+ (a+b));
		System.out.println("the substraction of these two number is: "+ (a-b));
		System.out.println("The multiplication of these two number is: "+ (a*b));
		System.out.println("The division of these two number is: "+ (a/b));
		System.out.println("the modulus of these two number is: "+ (a%b));
		System.out.println("the increement of a is: "+ (a++));
		System.out.println("the decreement of a is: "+ (a--));
		System.out.println("the value of a is: "+ a);
		
	}

}
