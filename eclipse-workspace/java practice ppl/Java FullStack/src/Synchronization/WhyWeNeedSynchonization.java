package Synchronization;

class sync extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
}
public class WhyWeNeedSynchonization {

	public static void main(String[] args) {
		sync s1 = new sync();
		System.out.println("****************Thead 1****************");
		s1.start();
		
		sync s2 = new sync();
		System.out.println("****************Thead 2****************");
		s2.start();
		
		sync s3 = new sync();
		System.out.println("****************Thead 3****************");
		s3.start();
	}
	// unexpected output or wrong output

}
