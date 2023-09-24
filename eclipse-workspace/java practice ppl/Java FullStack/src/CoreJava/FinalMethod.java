package CoreJava;

class abc
{
	public final void a()
	{
		System.out.println("this is in class abc(Parent class) ");
	}
}

class pqr extends abc
{
	public void a() //here we can see it shows error because we cannot overide the final methods
	{
		System.out.println("this is in class pqr(child class)");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		pqr p1 = new pqr();
		p1.a();
				

	}

}
