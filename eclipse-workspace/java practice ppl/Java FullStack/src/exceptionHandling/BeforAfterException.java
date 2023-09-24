package exceptionHandling;

public class BeforAfterException {

	public static void main(String[] args) {
		try
		{
			System.out.println("before exception occur");
			int x= 10/0;
			System.out.println("after exception occur ");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
 
}
