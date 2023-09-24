package Multithreading;
class threadA extends Thread
{
	public void run()
	{
		for(int i =0; i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.print("thread A : "+ i);
			}
			System.out.print("\t");
		}
	}
}
class threadB extends Thread
{
	public void run()
	{
		for(int j=0;j<=30;j++)
		{
			if(j%3==0)
			{
				System.out.print("thread B: "+ j);
			}
			System.out.print("\t");
		}
	}
}
class threadc extends Thread
{
	public void run()
	{
		for(int k =0;k<=50;k++)
		{
			if(k%5==0)
			{
				System.out.print("thread c: "+ k);
			}
			System.out.print("\t");
		}
	}
}
public class Multithreading {

	public static void main(String[] args) {
		threadA a1 = new threadA();
		threadB b1 = new threadB();
		threadc c1 = new threadc();
		a1.start();
		b1.start();
		c1.start();

	}

}
