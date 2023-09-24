package Java_besic;
import java.util.Scanner;
public class Switch {
  public static void main(String[] arg)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two number");
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	
	System.out.println("**********MENU**********");
	System.out.println("1.Addition");
	System.out.println("2.Substraction");
	System.out.println("3.Multiplication");
	System.out.println("4.dividion");
	System.out.println("5.Modulus");
	System.out.println("Enter your choice");
	int ch = sc.nextInt();
	
	switch(ch)
	{
	case 1 :
		System.out.println("Addition is: "+ (a+b));
		break;
	case 2:
		System.out.println("Multiplication is: "+ (a*b) );
		break;
	case 3:
		System.out.println("Substraction is: "+ (a-b));
		break;
	case 4:
		System.out.println("division is: "+ (a/b));
		break;
	case 5:
		System.out.println("modulus is: "+ (a%b));
		break;
	}
}
  }

