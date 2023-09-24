package practice_examples;
import java.util.Scanner;
import java.util.*;
public class Reverce_an_array {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
        int n =a.length;
        int i,j;
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
        	a[i] = sc.nextInt();
        }
        System.out.println("Array without reverce");
        for(i=0;i<n;i++)
        {
        	System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("reverce array");
        for(j=n-1;j>=0;j--)
        {
        	
        	System.out.print(a[j]+" ");
        }
          // System.out.println(Arrays.toString(a));
	}

}
