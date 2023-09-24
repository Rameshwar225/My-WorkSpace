package java_basic;
class nr extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("heyy there");
		}
	}
}
class nr1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("teri ma ki chut lavde");
		}
	}
}

public class set_parity {

	public static void main(String[] args) {
		nr n1 = new nr();
		nr1 n2 = new nr1();
		n1.setPriority(1);
		n2.setPriority(10);
		n1.start();
		n2.start();

	}

}
