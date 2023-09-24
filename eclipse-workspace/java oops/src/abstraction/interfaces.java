package abstraction;
interface work
{
   void done();
}
class project implements work
{
	public void done()
	{
		System.out.println("ram done there work very easily...");
	}
}

public class interfaces {

	public static void main(String[] args) {
		project p1 = new project();
	    p1.done();
	}
	

}
