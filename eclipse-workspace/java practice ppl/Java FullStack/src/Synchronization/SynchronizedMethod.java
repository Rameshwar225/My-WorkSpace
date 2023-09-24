package Synchronization;

class syncmethod implements Runnable
{
	public int n=0;
	public void run()
	{
		print();
		
	}
	
	synchronized public void print()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		System.out.println("*********************");
		
	}
}
public class SynchronizedMethod {

	public static void main(String[] args) {
		
		syncmethod m1 = new syncmethod();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		t1.start();
		t2.start();
		
		
		
		
				

	}

}
