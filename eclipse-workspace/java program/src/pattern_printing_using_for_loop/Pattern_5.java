package pattern_printing_using_for_loop;

public class Pattern_5 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=8;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=1;i<=7;i++)
		{
			for(j=7;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
