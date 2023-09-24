package exception_handling;

import java.util.Scanner;

public class Try_catch2 {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter index value on which you want do some operation");
		int index = sc.nextInt();
		System.out.println("enter the number which you want to divide the index number");
		int number = sc.nextInt();
		
		try
		{
			int result = a[index]/number;
			System.out.println(result);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("some error ocure "+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("some error ocure "+e);
		}

	}

}
