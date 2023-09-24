package multidimentional_Arry_2D_array;
import java.util.Scanner;
public class Multiplication_of_matrix_practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of column: ");
		int colm = sc.nextInt();
		
		int a[][] = new int[rows][colm];
		int b[][] = new int[rows][colm];
		int c[][] = new int[rows][colm];
		int i,j,k;
		
		System.out.println("enter 1st matrix elements");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<colm;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter 2nd matrix elements");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<colm;j++)
			{
				b[i][j]= sc.nextInt();
			}
		}
		for(i=0;i<rows;i++)
		{
			for(j=0;j<colm;j++)
			{
				c[i][j] =0;
				for(k=0;k<rows;k++)
				{
					c[i][j] += a[i][k] * b[j][k];
				}
			}
		}
		System.out.println("The multiplication of matrix is: ");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<colm;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
