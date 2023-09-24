package pattern_printing_using_for_loop;
//pattern
//* * * *
//* * *
//* *
//*
public class Pattern_pratice_1 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=3;i++)
		{
			for(j=3;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
