package java_basic;
class abc
{
	void get()
	{
		System.out.println("i am in base class");
	}
	void get(int a)
	{
		System.out.println(" method overloading");
	}
}
public class overriding {

	public static void main(String args[]) {
		abc a1 = new abc();
		a1.get();
		a1.get(5);
		
	}

}
