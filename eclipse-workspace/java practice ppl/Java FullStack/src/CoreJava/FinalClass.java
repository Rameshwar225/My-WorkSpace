package CoreJava;

final class  def
{
	int x;
	public void hello()
	{
		System.out.println("hello");
	}
}

class xyz extends def //here it shows the error because inheritance is not applicable for final class
{
	int y ;
	public void hello()
	{
		System.out.println("hello");
	}
}
public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
