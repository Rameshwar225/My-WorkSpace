package Synchronization;

class blocksync implements Runnable {
	public void run() {
		play();
	}

	public void play() {
		synchronized (this) {
			for (int i = 0; i <= 5; i++) {
				System.out.println(i);
			}
			System.out.println("*************************");
		}
	}
}

public class BlockSynchronization {

	public static void main(String[] args) {

		blocksync b = new blocksync();
		Thread t1 = new Thread(b);
		t1.start();
		Thread t = new Thread(b);
		t.start();
	}

}
