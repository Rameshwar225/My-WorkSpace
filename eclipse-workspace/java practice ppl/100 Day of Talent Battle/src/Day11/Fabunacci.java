package Day11;


import java.util.*;
public class Fabunacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int firstnum=0;
		int secnum=1;
		
		for(int i=1;i<=n+1;i++)
		{
			System.out.print(firstnum+" ");
			int nextnum = firstnum+secnum;
			firstnum=secnum;
			secnum=nextnum;
			
		}
		

	}

}
