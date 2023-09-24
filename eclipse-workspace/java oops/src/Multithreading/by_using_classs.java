package Multithreading;
class mul extends Thread 
{
	public void run()
	{
		System.out.println("thread aala re!!!!...PALA...");
	}
}
public class by_using_classs {

	public static void main(String[] args) {
		mul t1 = new mul();
		t1.start();

	}

}
