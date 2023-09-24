package array;

public class Priting_element_in_array_using_for_loop {

	public static void main(String[] args) {
		int age[] = {20,22,24,26,78};
		for(int i=0;i<age.length;i++)//here lenght is used for find the lenght of array 
		{
			System.out.println("The "+ (i+1) +" element is array is: " +age[i]);
		}
		

	}

}
