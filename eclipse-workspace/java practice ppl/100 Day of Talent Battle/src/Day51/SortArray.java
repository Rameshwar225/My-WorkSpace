package Day51;

public class SortArray {

	public static void main(String[] args) {
		
		int a[] = {1,5,4,3,2};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int tmp = 0;  
				if(a[i] > a[j])
				{
					tmp = a[i];  
					a[i] = a[j];  
					a[j] = tmp;
				}
			}
			System.out.print(a[i]);
		}

	}

}
