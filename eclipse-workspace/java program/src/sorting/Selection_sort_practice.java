package sorting;

public class Selection_sort_practice {

	public static void main(String[] args) {
	  int a[] = {10,854,75,94,-6,-5};
	  int n = a.length;
	  int i,j;
	  for(i=0;i<n-1;i++)
	  {
		  int min = i;
		  for(j=i;j<n;j++)
		  {
			  if(a[min]>a[j])
				  min= j;
		  }
		  int temp = a[min];
		  a[min] = a[i];
		  a[i] = temp;
		  
	  }
	  for(int item: a)
	  {
		  System.out.print(item+" ");
	  }
	}

}
