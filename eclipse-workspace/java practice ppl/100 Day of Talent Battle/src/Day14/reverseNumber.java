package Day14;

import java.util.*;
public class reverseNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int reminder;
		while(true)
		{
			reminder = n%10;
			System.out.print(reminder);
			n=n/10;
			if(n==0)
			{
				break;
			}
		}

	}

}
