package pattern_printing_using_for_loop;
import java.util.Scanner;
public class Pattern_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = sc.nextInt();
		int i,j;
		for(j=1;j<=5;j++)
		{
			for(i=1;i<=n;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
