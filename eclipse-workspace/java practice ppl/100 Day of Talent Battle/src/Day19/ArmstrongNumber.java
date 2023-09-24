package Day19;

import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int n = num;
		int sum =0;
		int r=0;
		int lastDigit = 0;
		int  i = 0;
		while(true)
		{
			r = n%10;
			if(i==0)
			{
				lastDigit=r;
			}
			else
			{
				n = n/10;
				sum = sum + (int) Math.pow(r, lastDigit);
				
			}
			
			if(n==0)
			{
				break;
			}
			i++;
		}
		if(num==sum)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
		

	}

}
