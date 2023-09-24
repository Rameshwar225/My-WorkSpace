package java_basic;

import java.util.Scanner;

public class array_into {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]= new int[5];
		System.out.println("Enter the elements in array: ");
		for(int i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int j=0;j<5;j++)
		{
			System.out.print(a[j]+" ");
		}

	}

}
