package CoreJava;


interface a
{
	public void run();
	
}

interface b
{
	public void stop();
	
}

class c implements a,b
{

	@Override
	public void stop() {
		System.out.println("From B class");
		
	}

	@Override
	public void run() {
		System.out.println("From A class");
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		c c1 = new c();
		c1.run();
		c1.stop();

	}

}
