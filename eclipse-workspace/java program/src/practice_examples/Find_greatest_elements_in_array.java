package practice_examples;

public class Find_greatest_elements_in_array {

	public static void main(String[] args) {
		int a[] = {42,6468,5454,4515,456,5465};
		int n= a.length;
		int max=0;
		{
			for(int i=0;i<n;i++)
			{
				if(a[i]>max)
					max=a[i];
			}
		}
		System.out.println(max);

	}

}
