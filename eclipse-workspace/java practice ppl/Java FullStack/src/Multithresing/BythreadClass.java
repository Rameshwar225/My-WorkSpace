package Multithresing;


class a extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Ram");
		}
		
	}
}
public class BythreadClass {

	public static void main(String[] args) {
		
		a a1 = new a();
		a1.start();
		name();
		
		
	}
	
	static public void name()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Lakhan");
		}
	}

}
