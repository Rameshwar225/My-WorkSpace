package pattern_printing_using_for_loop;
import java.util.Scanner;
public class Pattern_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many row you want to print");
		int r = sc.nextInt();
		
		int  i , j;
		for(i=1;i<=r;i++)
		{
			for(j=r;j>=i;j--)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}

	}

}
