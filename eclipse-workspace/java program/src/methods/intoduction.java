package methods;

public class intoduction {

	public static void main(String[] args) {
		
		//int firstnumber = 36;
		//int secondnumber = 455;
		int result = max(40,45);
		
		System.out.println(result);
		max(4);
		

	}
	static int max(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
		
	}
	static void max(int x) //method overriding :
	                       //the two method have same name but different parameters
	{                      //here we use max fuction in this code two time  
		System.out.println(x); //but we change the parametres 
	}
	

}
