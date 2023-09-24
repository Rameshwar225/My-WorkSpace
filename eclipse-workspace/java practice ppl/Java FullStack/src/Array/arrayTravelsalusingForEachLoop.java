package Array;

public class arrayTravelsalusingForEachLoop {

	public static void main(String[] args) {
		String array[]  = {"Ram","Kalyan","Gosavi","Vakav"};
		
		System.out.println("********************By using for loop************************");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("*******************By using for each loop********************");
		
		for(String s: array)
		{
			System.out.println(s);
		}
	}

}
