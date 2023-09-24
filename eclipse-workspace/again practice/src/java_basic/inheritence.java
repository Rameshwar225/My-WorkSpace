package java_basic;
class a5 
{
	String name;
	static String clg ="Malegaon";
	void info()
	{
		System.out.println("hello..! i am in class A ");
	}
}
class b extends a5
{
	int roll;
	void info1()
	{
		System.out.println("hello..! i am in class B ");
	}
}

public class inheritence {

	public static void main(String[] args) {
         a5 a1 = new a5();
         a1.info();
         
         b b1 = new b();
         b1.info();
	}

}
