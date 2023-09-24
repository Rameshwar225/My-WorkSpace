package transposition;

import java.util.Scanner;

public class transpositio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str = sc.nextLine();
		
		String str1 = str.replaceAll(" ", "");
		System.out.println(str1);
		
		int n = str1.length();
		int r =3;
		
		for(int i=0;i<n;i++)
		{
			if(i%4==0)
			{
				System.out.print(str1.charAt(i));
			}
		}
		for(int i=0;i<n;i++)
		{
			if((i+1)%2==0)
			{
				System.out.print(str1.charAt(i));
			}
		}
		for(int i=0;i<n;i++)
		{
			if((i+2)%4==0)
			{
				System.out.print(str1.charAt(i));
			}
		}
		

	}

}
