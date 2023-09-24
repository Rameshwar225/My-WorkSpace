package constructor;

class vehical
{
	int wheel;
	vehical()
	{
		wheel = 4;
	}
}

public class No_arguments_constructor {

	
	public static void main(String[] args) {
		//create a object
		vehical car = new vehical();
		vehical car1 = new vehical();
		
		//here we use the contructor for printing somethings  
		
		System.out.println(car.wheel+" wheels");
		System.out.println(car1.wheel+" wheels");

	}

}
