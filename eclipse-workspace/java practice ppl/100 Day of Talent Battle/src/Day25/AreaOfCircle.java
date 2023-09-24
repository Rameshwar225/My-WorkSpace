package Day25;

import java.util.Scanner;

class Circle
{
	private static float PI=3.14f;
	
	private float radius;
	
	public float area(float radius)
	{
		this.radius=radius;
		float area = PI*radius*radius;
		return area;
	}
}
public class AreaOfCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle();
		System.out.println("Enter the radius: ");
		float radius = sc.nextFloat();
		float area = c1.area(radius);
		System.out.println("The area of the cicle is: "+area);
				

	}

}
