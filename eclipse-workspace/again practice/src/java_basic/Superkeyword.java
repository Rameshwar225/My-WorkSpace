package java_basic;
class human
{
	String name ="ram";
}
class rambo extends human
{
	void display()
	{
		System.out.println(super.name);
	}
}

public class Superkeyword {

	public static void main(String[] args) {
		rambo r1 = new rambo();
		r1.display();
	}

}
