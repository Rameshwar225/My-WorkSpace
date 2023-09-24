package java_basic;
class hm extends Thread 
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}
class hm2 extends Thread
{
	public void run()
	{
		for(int j=0;j<=5;j++)
		{
			System.out.println(j);
		}
	}
}
public class multithrerding {

	public static void main(String[] args) {
		hm h1 = new hm();
		h1.start();
		hm2 h2 = new hm2();
		h2.start();

	}

}
