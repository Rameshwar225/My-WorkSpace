package abtraction;

 abstract class a //abtract class means which class have abtract method 
{                 //here we have great abstract method so we need to declare class a also abtract class 
	public void name()
	{
		System.out.println("my name is class A");
	}
	abstract public void great();  //abract method means which method does not have any implimentation
}                                   //here we create a abtract method 
class b extends a
{
	 public void great()
	{
		System.out.println("helloooo");
	}
	 public void name()
		{
			System.out.println("my name is class b");
		}
}

class c extends a
{
	public void great()
	{
		System.out.println("hiii rambo");
	}
	public void name()
	{
		System.out.println("my name is class c");
	}
}




public class Intro_abtraction {

	public static void main(String[] args) {
        //here we create a object of class b
		b b1 = new b();
		b1.great();
		b1.name();
		//here we create a object of class c
		c c1 = new c();
		c1.great();
		c1.name();
		

	}

}
