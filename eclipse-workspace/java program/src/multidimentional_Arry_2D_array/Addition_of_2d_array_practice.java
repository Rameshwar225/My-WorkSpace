package multidimentional_Arry_2D_array;
import java.util.Scanner;
public class Addition_of_2d_array_practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		System.out.println("enter the number of column");
        int colm = sc.nextInt();
        
        int a[][] = new int[rows][colm];
        int b[][] = new int[rows][colm];
        int c[][] = new int[rows][colm];
        int i,j;
        
        System.out.println("enter the 1st array elements");
        for(i=0;i<rows;i++)
        {
        	for(j=0;j<colm;j++)
        	{
        		a[i][j] =sc.nextInt();
        	}
        }
        System.out.println("enter the 2nd array elements");
        for(i=0;i<rows;i++)
        {
        	for(j=0;j<colm;j++)
        	{
        		b[i][j] =sc.nextInt();
        	}
        }
        for(i=0;i<rows;i++)
        {
        	for(j=0;j<colm;j++)
        	{
        		c[i][j] = a[i][j] +b[i][j];
        	}
        }
        System.out.println("addition of two matrix is");
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
