package practice_examples;
import java.util.Arrays;
public class Smallest_elements_in_array {

	public static void main(String[] args) {
		int a[] = {10,5,1,6,-1,6};
		int n=a.length;                        //method to solve
        int min = 0;                // Create a min variable and initialize it with arr[0].
                                    //Use a for loop and compare it with other elements of the array
                                    //If any element is less than the min value, 
                                    //update min value with element’s value
                                   //Print the min variable.
       for(int i=0;i<n;i++)
        {
        	if(a[i]<min)
        	{
        		min=a[i];
        	}
        }
        System.out.println(min);
}
}
