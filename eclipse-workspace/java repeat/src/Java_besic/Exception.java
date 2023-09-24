package Java_besic;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try
		{
			int x = a/b;
			System.out.println(x);
		}catch(Exception e)
		{
			System.out.println("error is occure"+ e);
		}
	}

}
