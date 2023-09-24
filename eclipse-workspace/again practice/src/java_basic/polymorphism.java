package java_basic;
class fruit
{
	void info()
	{
		System.out.println("i am in base class");
	}
}
class mango extends fruit
{
	void info()
	{
		System.out.println("i am in child class");
	}
}

public class polymorphism {

	public static void main(String[] args) {
		fruit f1 = new fruit();
		f1.info();
		mango m1 = new mango();
		m1.info();
				

	}

}
