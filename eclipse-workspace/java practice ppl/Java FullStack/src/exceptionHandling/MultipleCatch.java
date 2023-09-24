package exceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("This is a arithmetic exception");
		}
		catch(Exception e)
		{
			System.out.println("this is a exception");
		}

	}

}
