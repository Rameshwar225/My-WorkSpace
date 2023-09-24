package Java_besic;
import java.util.Scanner;
public class addmatric {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number of row: ");
         int r = sc.nextInt();
         System.out.println("Enter number of column: ");
         int c = sc.nextInt();
         
         int a[][] = new int[r][c];
         int b[][] = new int[r][c];
         int add[][] = new int[r][c];
         
         System.out.println("Enter the elements of matrix a");
         for(int i=0;i<=r-1;i++)
         {
        	 for(int j=0;j<=c-1;j++)
        	 {
        		 a[i][j] =sc.nextInt(); 
        	 }
         }
         
         System.out.println("Enter the elements of matrix B");
         for(int i=0;i<=r-1;i++)
         {
        	 for(int j=0;j<=c-1;j++)
        	 {
        		 a[i][j] =sc.nextInt(); 
        	 }
         }
         
         
         for(int i=0;i<=r-1;i++)
         {
        	 for(int j = 0; j<=c-1;j++)
        	 {
        		 add[i][j] = a[i][j] + b[i][j];
        	 }
         }
         
         System.out.println("The addition of matrix a and matrix b is: ");
         for(int i=0;i<=r-1;i++)
         {
        	 for(int j =0;j<=c-1;j++)
        	 {
        		 System.out.println(add[i][j]);
        	 }
         }
	}

}
