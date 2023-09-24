package java_basic;

class Rmg
{
//	int c;
	//constructor
	Rmg(int a)
	{
//		this.c=a;
		System.out.println(a);
	}
	//method
	void fun1(int b)
	{
		System.out.println(b);
	}
	
}
public class constructorp {

	public static void main(String[] args) {
		Rmg r1 = new Rmg(78);
		r1.fun1(5);
	}

}
