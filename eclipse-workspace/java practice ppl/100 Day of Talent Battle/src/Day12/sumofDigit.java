package Day12;

import java.util.Scanner;

public class sumofDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int r;
		int count=0;
		while(true)
		{
			r=n%10;
			count=count+r;
			n=n/10;
			if(n==0)
			{
				break;
			}
		}
		System.out.println(count);

	}

}
