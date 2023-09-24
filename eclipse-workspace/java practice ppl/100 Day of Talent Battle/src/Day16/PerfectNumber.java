package Day16;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter the number: ");
		int n = sc.nextInt();
		int sum=0;
		int i;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
//				System.out.println(i);
			}
		}
		if(n==sum)
		{
			System.out.println("number is perfect ");
		
		}
		else
		{
			System.out.println("Number is not perfect");
		}

	}

}
