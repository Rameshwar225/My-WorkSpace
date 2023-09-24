package multidimentional_Arry_2D_array;
import java.util.Scanner;
public class Multiplication_of_matrix {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of column");
		int colm = sc.nextInt();
		
		int a[][] = new int[rows][colm];
		int b[][] = new int[rows][colm];
		int i,j,k;
		
		System.out.println("enter the values of 1st matrix");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<colm;j++)
			{
				a[i][j] =sc.nextInt(); 
			}
		}
		System.out.println("enter the values of 2nd matrix");
		for(i=0;i<rows;i++)
		{
			for(j=0;j<colm;j++)
			{
				b[i][j] =sc.nextInt(); 
			}
		}
		 int mul[][]=new int[rows][colm];
		for(i=0;i<rows;i++)
		{
			for(j=0;j<colm;j++)
			{
				for(k=0;k<rows;k++)
			  {
					mul[i][j] += a[i][k] * b[k][j]; 
			  }
				
			}
		}
		System.out.println("the multiplication of two matix is: ");
		for( i=0;i<rows;i++)
		{
			for( j=0;j<colm;j++)
			{
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
