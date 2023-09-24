package pattern_printing_using_for_loop;
import java.util.Scanner;
            //pattern
    //* * * *
    //  * * *
    //    * *
    //      *



public class Pattern_3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many row you want to print");
  		int r = sc.nextInt();
  		
   		int i,j;
   		for(i=1;i<=r;i++)
   		{
   			for(j=1;j<=i-1;j++)
   			{
   				System.out.print("  ");
   			}
   			for(int k = 1;k<=r-i+1;k++)
   			{
   				System.out.print("* ");
   			}
   			System.out.println();
   		}
	}

}
