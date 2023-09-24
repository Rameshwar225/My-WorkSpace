package Whle_loops;
import java.util.Scanner;
public class Sum_of_digit_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int temp=n;
		int sum=0;
		while(temp>0)
		{
			int lastdigit=temp%10;
			temp=temp/10;
			sum=sum+lastdigit;
		}
		System.out.println("the sum of digit of the  number "+n+" is "+sum);
		
		
		
	}

}
