package java_basic;
import java.util.Scanner;
public class exception_handling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try
		{
			int c= a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("exception is present which name is "+e);
			
		}
				

	}

}
