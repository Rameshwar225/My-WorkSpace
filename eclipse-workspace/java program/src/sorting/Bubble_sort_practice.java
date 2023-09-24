package sorting;

import java.util.Scanner;

public class Bubble_sort_practice {

	public static void main(String[] args) {
		float a[] = new float[50];
		int n =a.length;
		int i,j;
		System.out.println("Enter array elements: ");
		for(i=0;i<n;i++)
		{
			Scanner sc = new Scanner(System.in);
		    a[i]= sc.nextInt();
		}

		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(a[j+1]<a[j])
				{
					float temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		for(float item: a)
		{
			System.out.print(item+" ");
		}

	}

}
