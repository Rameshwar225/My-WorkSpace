package java_basic;
abstract class abstraction2
{
	abstract void display();
	void f1()
	{
		System.out.println("i am in parent class");
	}
}
class ab extends abstraction2
{

	@Override
	void display() {
		System.out.println("i am in class ab");
	}

}
class bc extends abstraction2
{

	
	void display() {
		System.out.println("i am in class bc");
	}

}
public class Abstraction {

	public static void main(String[] args) {
         bc bc1 = new bc();
         bc1.f1();
         bc1.display();
         
         ab ab1 = new ab();
         ab1.display();
         ab1.f1();
         
         
         
	}

}
