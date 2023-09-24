package pattern_printing_using_for_loop;

public class Sum_of_array_elements {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int n =a.length;
		int sum=0,i;
		for(i=0;i<n;i++)
		{
			sum = sum+a[i];
		}
		System.out.println(sum);

	}

}
