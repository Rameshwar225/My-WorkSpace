
public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {15,7,2,6,7};
		int length = arr.length;
		
		for(int i=0;i<length-1;i++)
		{
			int Min_Index=i;
			for(int j=i+1;j<length;j++)
			{
				if(arr[Min_Index]>arr[j])
				{
					Min_Index=j;
				}
			}
			int temp = arr[Min_Index];
			arr[Min_Index] = arr[i];
			arr[i] = temp;
		}
		
		for(int i=0;i<length;i++)
			
		{
			System.out.print(arr[i]+" ");
		}

	}

}
