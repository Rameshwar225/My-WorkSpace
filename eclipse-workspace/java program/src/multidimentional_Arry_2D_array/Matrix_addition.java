package multidimentional_Arry_2D_array;
import java.util.Scanner;
public class Matrix_addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and column: ");
		int rows = sc.nextInt();
		int colm = sc.nextInt();
		
		int a[][] = new int[rows][colm];
		int b[][] = new int[rows][colm];
		
		//lets print 1st matrix elements
		System.out.println("Enter first array elemnts: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<colm;j++)
			{
				
				a[i][j] =sc.nextInt(); 
			}
		}
		//lets print 2nd matrix elements
		System.out.println("Enter 2nd matrix elemnts: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<colm;j++)
			{
			
				b[i][j]=sc.nextInt();
			}
		}
		//lets create 1 array for storing the sum of a and b array
		int c[][] = new int[rows][colm];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<colm;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		//lets print the c matrix which is our result matrix
		
		System.out.println("the sum of two matix is: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<colm;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	

	}

}
