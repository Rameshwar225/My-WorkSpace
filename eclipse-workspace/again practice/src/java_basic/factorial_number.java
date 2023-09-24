package java_basic;
import java.util.Scanner;
public class factorial_number
{
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int fact =1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of number "+ n + " is "+ fact);
	}
}