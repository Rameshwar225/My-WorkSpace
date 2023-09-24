package oops;
import java.util.Scanner;
 class area
{
	public
		float hight,width;
        void set(float width, float hight )
        {
        	this.hight= hight;
        	this.width=width;
        	double a =  (0.5*hight*width);
        	System.out.println("the area of trangle is: "+a);
        }
	
		
	
}
public class tringle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		area a1 = new area();
		System.out.println("Enter the hight and width of trangle: ");
		 float hight = sc.nextFloat();
		 float width = sc.nextFloat();
		a1.set(hight,width);

	}

}
