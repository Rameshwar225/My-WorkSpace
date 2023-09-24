package Synchronization;


class staticsync implements Runnable
{
	public void run()
	{
		print();
	}
	 synchronized public void print() // this method is synchronized but till now it shows the unextected  output beacuse there two diffeent obejct trying to access the one method so for that we have a static synchronization
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
		System.out.println("****************");
	}
}

public class whyWeNeedStaticSyncronization {

	public static void main(String[] args) {
		staticsync s1 = new staticsync();
		staticsync s2 = new staticsync();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		t2.start();
		
		t1.start();
		

	}

}
