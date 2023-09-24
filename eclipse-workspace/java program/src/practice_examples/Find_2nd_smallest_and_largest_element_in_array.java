package practice_examples;

public class Find_2nd_smallest_and_largest_element_in_array {

	public static void main(String[] args) {
		int  a[] = {44,557,65,3,66,2,63,5,-999};
		int n =a.length;
		int i,j;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(a[j+1]<a[j])
				{	
					int temp = a[j+1];
				    a[j+1] = a[j];
				    a[j] = temp;
				}   
			}
		}
		System.out.println("The 2nd smallest elemnts in array is: "+a[1]);
		System.out.println("the 2nd lergest elements in array is: "+a[n-1]);

	}

}
