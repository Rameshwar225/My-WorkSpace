package Basic;

import java.util.*;
public class SumOfDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int sum=0;
		
		while(true)
		{
			sum=sum+n%10;
			 n = n/10;
			
			if(n<10)
			{
				break;
			}
		}
		sum=sum+n;
		System.out.println(sum);

	}

}
