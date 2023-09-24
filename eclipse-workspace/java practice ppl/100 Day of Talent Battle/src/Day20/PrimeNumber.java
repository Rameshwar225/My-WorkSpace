package Day20;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:" );
		int n = sc.nextInt();
		isPrime(n);
		
		
	}
	
//	fuction for prime number: 
	public static void isPrime(int n)
	{
		int temp=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				temp++;
				
			}
			
		}
		if(temp!=0)
		{
			System.out.println(n+" is not a prime number");
		}
		else
		{
			System.out.println(n+" is a prime number");
		}
		
		
	}

}
