package methods;

public class Pass_by_value {   //java is always pass by value

	public static void main(String[] args) {   //if in this program swap is done then  the language is 
	                                       //pass by reference otherwise the language is pass by value
		int c = 34;                        //here we try to swap but it is not done so thats why java is 
		int d = 12;                        //always pass by value
		swap(c,d);
		System.out.println(c+" "+d);
		
	}
	
	
	static void swap(int a,int b)
	{
		int temp = a;
		a=b;
		b=temp;
	}

}
