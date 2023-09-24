package CoreJava;


class AppTest
{
	int a=1;
	static int b=2;
	public void main()
	{
		System.out.println(innerStatic.c);
	}
	
	public static class innerStatic
	{
		static int c=10;
		public static void hii()
		{
			System.out.println("hii");
			System.out.println("the value of b: "+b);
		}
	}
}
public class StaticInnerClassExtra {

	public static void main(String[] args) {
		AppTest.innerStatic.hii();
		AppTest a1 = new AppTest();
		a1.main();
	}

}
