package CoreJava;


abstract class person
{
	public void speek()
	{
		System.out.println("The boy is Speeking");
	}
	
	abstract void run();
}

class veg extends person
{

	void run() {
		System.out.println("I am the vegiterian");
		
	}
	
}

class nonveg extends person
{
	void run()
	{
		System.out.println("I can eat non veg");
	}
}


public  class AbstractClass {
	
	
	public static void main(String[] args)
	{
		
		person ram = new veg();
		person sham = new nonveg();
		
		System.out.println("**********The information about veg person**********");
		ram.run();
		
		System.out.println();
		
	}
	
	



	
}


