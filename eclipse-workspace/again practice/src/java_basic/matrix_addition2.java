package java_basic;
import java.util.Scanner;
public class matrix_addition2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row and column");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		int d[][] = new int[r][c];
		
		System.out.println("Enter 1st matrix elements: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter 2nd matrix elements: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Addition of two matrix is: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				d[i][j]= a[i][j]+b[i][j];
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("digonal elements zero");
	for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j)
				{
					d[i][j]=0;
					System.out.print(d[i][j]+" ");
				}
				System.out.println();
			}
		}


	}

}
