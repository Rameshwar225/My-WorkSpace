package java_basic;

import java.util.Scanner;

public class array_of_name {

	public static void main(String[] args) {
		String a[]=new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of students: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextLine();
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}

	}

}
