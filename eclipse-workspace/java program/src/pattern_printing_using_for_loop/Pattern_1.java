package pattern_printing_using_for_loop;
import java.util.Scanner;
public class Pattern_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many row you want to print");
		int r = sc.nextInt();
		System.out.println("enter how many colomn you want to print");
		int c =sc.nextInt();
		int j,i;
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=c;j++)
			{
				System.out.print("* ");
				
			}
		
			System.out.println();
		}

	}

}
