package Method_overloading;
import java.util.Scanner;
class number
{
	void add(int a,int b)
	{
		int f = a+b;
		System.out.println("The addition of two number is: "+ f);
	}
	void add(int a,int b, int c)
	{
		int d = a+b+c;
		System.out.println("The addition of three number is: "+ d);
	}
} 

public class example {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter three number: ");
	  int a = sc.nextInt();
	  int b = sc. nextInt();
	  int c = sc.nextInt();
	  
	  number n1= new number();
	  n1.add(a, b);
	  n1.add(a, b, c);

	}
	
}
