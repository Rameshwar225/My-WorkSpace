package data_type_and_veriable;

public class type_casting { //type casting means change the int into float, byte into double etc......
	  

	public static void main(String[] args) {
		System.out.println("atomatic type casting done as following");
		byte x =4;       //this type of type casting called automatic type casting
		double y = x;
		System.out.println(x);
		System.out.println(y);
		
		//now lets see manual type casting 
		
		System.out.println(" manual type casting done as following");
		
		double myd = 3.14;
		int myi = (int) myd;  //in manual type casting we convert float into int , float into byte, double into int etc...... 
		
		System.out.println(myd);
		System.out.println(myi);
		

	}

}
