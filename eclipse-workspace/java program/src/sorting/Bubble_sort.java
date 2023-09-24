package sorting;
//bubble sort: 
//in bubble sort we check the value or right side is less than or greater than left side value 
//if it is less than then swap the.......like this we can check all elements is array and sort them



public class Bubble_sort {

	public static void main(String[] args) {
		int a[] = {2,1,8,-3,12,10};
		int n = a.length;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j =0;j<n-1;j++)
			{
				if(a[j+1]<a[j]) //here we check the elemnt of right side is smaller than left side
				{
					//swap the value
					int temp = a[j+1];
					a[j+1] =a[j];
					a[j]=temp;
				}
			}
		}
		for(int item: a) //here we strored sorted array in item veriable and just print it
		{
			System.out.print(item+" ");
		}
		
	}

}
