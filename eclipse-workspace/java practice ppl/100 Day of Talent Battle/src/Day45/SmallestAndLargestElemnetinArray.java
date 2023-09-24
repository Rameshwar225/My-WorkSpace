package Day45;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLargestElemnetinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int arraylength = sc.nextInt();
		
		int arr[]= new int[arraylength];
		
		for(int i=0;i<arraylength;i++)
		{
			System.err.println("Enter array element at position "+ i);
			arr[i]= sc.nextInt();
		}
		System.out.println("Array elements are");
		for(int i=0;i<arraylength;i++)
		{
			System.out.println(arr[i]+ " ");
		}
		
		 
		Arrays.sort(arr);
		
		System.out.println("Smallest element of array is: "+ arr[0]);
		System.out.println("Largest element of array is: "+ arr[arraylength-1]);
		

	}

}
