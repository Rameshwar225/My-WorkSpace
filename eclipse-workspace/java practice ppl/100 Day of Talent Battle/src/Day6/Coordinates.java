package Day6;

import java.util.*;
public class Coordinates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		if(a>0 && b>0)
		{
			System.out.println("This point lies in first quadrant.");
		}
		else if(a<0 && b>0)
		{
			System.out.println("This point lies in second quadrant.");
		}
		else if(a<0 && b <0)
		{
			System.out.println("This point lies in third quadrant.");
		}
		else if(a>0 && b<0)
		{
			System.out.println("This point lies in fourth quadrant.");
		}
		else if(a==0 && (b>0 || b<0) )
		{
			System.out.println("This point lies on y axis");
		}
		else if((a>0 || a<0) && b==0)
		{
			System.out.println("This point lies on x axis");
		}
		else
		{
			System.out.println("This point lies on origin");
		}

	}

}
