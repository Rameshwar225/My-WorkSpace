package abtraction;

abstract class a1
{
	abstract void sum(); 
}
class b1 extends a1
{
	void sum()
	{
		int x =5;
		int y=10;
		int z= x+y;
		System.out.println(z);
	}
}
class c1 extends a1
{
	void sum()
	{
		System.out.println("i am in sum abtract method in c1 class");
	}
};


public class abtract_practice {

	public static void main(String[] args) {
		b1 obj1 = new b1();
		obj1.sum();
		

	}

}
