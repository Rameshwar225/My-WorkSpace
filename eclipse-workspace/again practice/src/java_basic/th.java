package java_basic;
class th1 extends Thread 
{
	public void run()
	{
		System.out.println("ramboo");
	}
}
public class th {

	public static void main(String[] args) {
		th1 t1 =new th1();
		t1.start();

	}

}
