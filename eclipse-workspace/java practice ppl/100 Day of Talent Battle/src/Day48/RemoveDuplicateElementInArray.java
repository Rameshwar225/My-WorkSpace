package Day48;

import java.util.Arrays;

public class RemoveDuplicateElementInArray {

	public static void main(String[] args) {
		
		int arr[] = {5,4,5,7,7,10};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++)
		{
			int j=0;
			if(arr[i]!=arr[i+1])
			{
				arr[j++] = arr[i];
				System.out.println(arr[i]);
			}
			
			arr[j++] = arr[arr.length-1];
			
		}
		
		

	}

}
