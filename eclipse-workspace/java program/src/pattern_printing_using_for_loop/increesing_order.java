package pattern_printing_using_for_loop;

public class increesing_order {

	public static void main(String[] args) {
		int a[] = {111,42,83,4,5,67,779,4564,87};
		int n = a.length;
	    int i;
	    for(i=0;i<n-1;i++)
	    {
	    	for(int j=0;j<n-1;j++)
	    	{
	    		if(a[j+1]<a[j])
	    		{
	    			int temp = a[j+1];
	    			a[j+1] = a[j];
	    			a[j] =temp;
	    		}
	    	}
	       for(int item :a)
	       {
	    	   System.out.print(item+" ");
	       }
	    }
	}

}
