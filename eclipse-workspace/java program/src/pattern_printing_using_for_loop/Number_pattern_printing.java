package pattern_printing_using_for_loop;

public class Number_pattern_printing {

	public static void main(String[] args) {
		int i,j,k;
		int n=1;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5-i;j++)
			{
				System.out.print("  ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(n+"  ");
				n++;
			}
			System.out.println();
		}
	}

}
