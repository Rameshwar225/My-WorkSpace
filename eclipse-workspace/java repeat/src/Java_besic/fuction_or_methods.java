package Java_besic;

import java.util.Scanner;

public class fuction_or_methods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int c=sc.nextInt();
		int d=sc.nextInt();
		add(c,d);
		sub(c,d);
		mul(c,d);
		div(c,d);
	}


static void add(int a, int b)
{
	System.out.println("addition is: "+ (a+b));
}
static void sub(int a, int b)
{
	System.out.println("addition is: "+ (a-b));
}
static void mul(int a, int b)
{
	System.out.println("addition is: "+ (a*b));
}
static void div(int a, int b)
{
	System.out.println("addition is: "+ (a/b));
}
}
