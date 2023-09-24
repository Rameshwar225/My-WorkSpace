package Day26;

import java.util.Scanner;

public class NumberOfHandle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		System.out.print(handshake(n));
	}
	
	public static int handshake(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			sum = sum+(n-i);
		}
		return sum;
	}

}
