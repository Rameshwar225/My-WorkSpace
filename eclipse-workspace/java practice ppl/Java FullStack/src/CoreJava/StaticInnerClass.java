package CoreJava;

class app
{
	static class phone
	{
		public static void test()
		{
			System.out.println("heyy there i am testing the code");
		}
	}
}
public class StaticInnerClass {

	public static void main(String[] args) {
		
		app.phone.test(); // here we dont have any need to create a object of outer class because of the static keyword

	}

}
