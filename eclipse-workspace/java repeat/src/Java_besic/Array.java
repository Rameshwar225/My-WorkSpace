package Java_besic;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many student are present in your class..");
	int n = sc.nextInt();
	 int marks[] = new int[n];
	 System.out.println("Enter marks of students: ");
	 for(int i=0;i<=n-1;i++)
	 {
		 marks[i]= sc.nextInt();
	 }
	 System.out.println("the values of array is: ");
	 for(int j = 0 ;j<=n-1;j++)
	 {
		 System.out.print("\t"+ marks[j]);
	 }
	
	}

}
