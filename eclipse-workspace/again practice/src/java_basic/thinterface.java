package java_basic;
class ru implements Runnable
{

	@Override
	public void run() {
		System.out.println("hi hhhhaaaaa");
		
	}
	
}
public class thinterface {

	public static void main(String[] args) {
		ru r1 =new ru();
		Thread th = new Thread(r1);
		th.start();
		

	}

}
