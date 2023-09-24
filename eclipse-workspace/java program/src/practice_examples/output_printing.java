package practice_examples;
import java.util.Scanner;
public class output_printing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i;
		
		for(i=1;i<=a;i++)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
		for(i=a;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		

	}

}
