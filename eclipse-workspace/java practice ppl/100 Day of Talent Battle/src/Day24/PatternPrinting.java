package Day24;

public class PatternPrinting {

	public static void main(String[] args) {
		
		int r=5;
		
		for(int i=0;i<=r;i++)
		{
			 for (int j=r-i; j>1; j--)
	            {
	                // printing spaces
	                System.out.print(" ");
	            }
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
