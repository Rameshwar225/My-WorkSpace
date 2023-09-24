package Java_besic;

import java.util.Scanner;

public class Mtrix_opration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		System.out.println("Enter 1st array element");
		for(int i =0;i<=2;i++)
		{
			for(int j =0;j<=2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter 2nd array element");
		for(int i =0;i<=2;i++)
		{
			for(int j =0;j<=2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		for(int i =0;i<=2;i++)
		{
			for(int j =0;j<=2;j++)
			{
			   c[i][j] = a[i][j]+b[i][j];
			}
		}
		System.out.println("The addition of matrix is: ");
		for(int i =0;i<=2;i++)
		{
			for(int j =0;j<=2;j++)
			{
			   System.out.print("\t" + c[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
