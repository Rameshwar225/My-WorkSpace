package java_basic;

import java.util.Scanner;

public class linear_search {

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc= new Scanner(System.in);
		int i,j,key,l;
		l = sc.nextInt();
		int a[]=new int[l];
		System.out.println("Enter array elements: ");
		for(i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
//		System.out.println("Enter elements which is you want to search in array: ");
//		key = sc.nextInt();
		for(j=0;j<a.length;j++)
		{
			if(a[j]==key)
			{
				System.out.println("elements found at "+j +" location");
			}
		}

	}

}
