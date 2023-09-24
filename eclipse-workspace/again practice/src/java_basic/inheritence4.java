package java_basic;
class abcd
{
	String name;
	void info()
	{
		System.out.println("i am info");
	}
}
class pqrs extends abcd
{
	void function()
	{
		System.out.println("i am fuction class");
	}
}
class xyza extends pqrs
{
	void display()
	{
		System.out.println("i am display class");
	}
}
class dfgs extends abcd
{
	void m1()
	{
		System.out.println("i am in class m1");
	}
	
}
public class inheritence4 {

	public static void main(String[] args) {
//		abcd a1 = new abcd();
//		a1.info();
//		pqrs p1 = new pqrs();
//		p1.function();
//		p1.info();
//		xyza x1 = new xyza();
//		x1.display();
//		x1.function();
//		x1.info();
		dfgs d1 = new dfgs();
		d1.m1();
		d1.info();
		
	}

}
