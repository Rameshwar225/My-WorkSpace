package Multithresing;

class r implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Ram");
		}
	}
}
public class ByUsingRunnableInterface {

	public static void main(String[] args) {
		
		
		r r1 = new r();
		Thread t1 = new Thread(r1);
		t1.start();
		name();

	}
	static void name()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Lakhan");
		}
	}

}
