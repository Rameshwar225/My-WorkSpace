
public class SelectionSort3 {

	public static void main(String[] args) {
		 int arr[] = {4,5,7,1,2,9};
		 int length = arr.length;
		 
		 for(int i=0; i<length-1;i++)
		 {
			 int min = i;
			 
			 for(int j=i+1;j<length;j++)
			 {
				 if(arr[min] > arr[j])
				 {
					 min = j;
				 }
			 }
			 int temp = arr[min];
			 arr[min] = arr[i];
			 arr[i] = temp;
			 
		 }
		 
		 for(int x: arr)
		 {
			 System.out.print(x +" ");
		 }

	}

}
