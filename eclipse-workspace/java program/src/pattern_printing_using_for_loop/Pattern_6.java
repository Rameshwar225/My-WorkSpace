package pattern_printing_using_for_loop;
//pattern 
   //    *
   //  *   * 
   //*   *   *
 // *  *   *  *


public class Pattern_6 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=4;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
