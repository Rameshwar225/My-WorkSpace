package Multithreading;

class th implements Runnable
{
	@Override
	public void run() {
		System.out.println("thread Yetoy savdhan..!!!!");
	}
}
public class by_using_interface {

	public static void main(String[] args) {
		th t1 = new th();
		Thread thread = new Thread(t1);
		thread.start();
	}

}


