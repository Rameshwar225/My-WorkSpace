package Java_besic;
import java.util.Scanner;
public class conditionalstatement {

	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int A = sc.nextInt();
		if(A==5)
		{
			System.out.println("your number is 5");
		}
		else if(A > 5)
		{
			System.out.println("number is greter than five");
		}
		else
		{
			System.out.println("Number is less than 5");
		}
	}
}
