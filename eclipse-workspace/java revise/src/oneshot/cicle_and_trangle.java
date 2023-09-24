package oneshot;

import java.util.Scanner;

class cicle
{
	int r;
	float pi=3.14f;
	void areac()
	{
		float area = (pi*r*r);
		System.out.println("The area of cercle is: "+area);
		
	}
}
public class cicle_and_trangle {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     cicle c1 = new cicle();
     System.out.println("Enter radius of circle");  
     c1.r=sc.nextInt();
     c1.areac();
	}

}
