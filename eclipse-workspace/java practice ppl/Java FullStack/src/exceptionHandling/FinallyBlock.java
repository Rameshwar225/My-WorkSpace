package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		try
		{
			int x=10/0;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This is the finally block which is always get excuted");
		}
	}

}
