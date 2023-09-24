package Day9;

import java.util.*;
public class NoOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int count=0;
		int reminder;
		while(true)
		{
			
			reminder=n%10;
			count++;
			n=n/10;
			if(n==0)
			{
				break;
			}
		}
		System.out.println(count);
		

	}

}
