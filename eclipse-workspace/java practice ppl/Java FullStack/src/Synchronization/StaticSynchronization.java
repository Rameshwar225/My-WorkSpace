package Synchronization;

class bank implements Runnable {
	static int balance = 500;
	static int withdrol;

	public bank(int withdrol) {

		this.withdrol = withdrol;
	}

	public void run() {
		check();
	}

	static synchronized public void check() {
		String name = Thread.currentThread().getName();
		if (withdrol <= balance) {
			System.out.println("Done by " + name);
			balance = balance - withdrol;
		} else {
			System.out.println("Fail by " + name);
		}
	}
}

public class StaticSynchronization {

	public static void main(String[] args) {
		bank b1 = new bank(500);
		bank b2 = new bank(500);
		Thread t1 = new Thread(b1);
		t1.setName("Ram");
		Thread t2 = new Thread(b2);
		t2.setName("Lakhan");
		t1.start();
		t2.start();

	}

}
