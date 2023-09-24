package oneshot;
import java.util.Scanner;
public class matrix {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[][] = new int[3][3];
	int b[][] = new int[3][3];
	int c[][] = new int[3][3];
	System.out.println("Enter 1st matrix elements");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			a[i][j] = sc.nextInt();
		}
	}
	System.out.println("Enter 2nd matrix elements");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			b[i][j] = sc.nextInt();
		}
	}
	System.out.println("Addition of matrix is");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			c[i][j] = a[i][j] + b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(i==j)
			{
				c[i][j]=0;
				System.out.print(c[i][j]+" ");
			}
		}
		System.out.println();
	}
	

	}

}
