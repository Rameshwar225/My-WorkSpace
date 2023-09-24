package pattern_printing_using_for_loop;
//pattern 
//     * 
//    **
//   ***
//  ****

public class Pattern_7 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=10;i++)
		{
			for(j=10;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
