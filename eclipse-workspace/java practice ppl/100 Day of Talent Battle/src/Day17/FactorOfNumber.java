package Day17;

import java.util.*;
public class FactorOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter the number: ");
		int n = sc.nextInt();
		System.out.println("Factor of "+n+" are: ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		
		}

	}

}
