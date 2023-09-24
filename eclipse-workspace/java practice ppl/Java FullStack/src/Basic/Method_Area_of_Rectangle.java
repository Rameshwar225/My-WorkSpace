package Basic;
import java.util.*;
public class Method_Area_of_Rectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of a rectangle: ");
		float h = sc.nextFloat();
		System.out.println("Enter the breath of rectangle: ");
		float b = sc.nextFloat();
		
		System.out.println("The area of rectngle is : "+AreaOfRectangle(h,b));
		
		

	}
	
	public static float AreaOfRectangle(float h, float b)
	{
		float area = h*b;
		return area;
	}

}
