package Day21;

import java.util.Scanner;

public class PalimdromNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		if(reverse(n)==n)
		{
			System.out.println("palimndrome");
		}
		else
		{
			System.out.println("not a palimdrome");
		}
		
		

	}
	
	public static int reverse(int n)
	{
		int num=0;
		int reverse=0;
		while(n!=0)
		{
			num = n%10;
			reverse = reverse*10+num;
			n = n/10;
		}
		return reverse;
		
		
		
	}

}
