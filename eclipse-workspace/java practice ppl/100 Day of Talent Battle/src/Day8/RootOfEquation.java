package Day8;

import java.util.*;
import java.lang.*;

public class RootOfEquation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entert the value of A,B and C");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double x;
		double y;
		double d;

		x = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

		y = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		
		d = b*b-4*a*c;
		
		if(d>0)
		{
			System.out.println("Roots are Real and distinct ");
		}
		else if(d==0)
		{
			System.out.println("Roots are real and equal");
		}
		else if(d<0)
		{
			System.out.println("Roots are complex and distinct");
		}
		
		System.out.println("The roots is: "+x +" And "+y );

	}

}
