package classesAndObjects;
class circle
{
	int redius;
	
	void area()
	{
		double area= 2.14*redius*redius;
		System.out.println(area);
	}
	
}


public class area_of_circle {

	public static void main(String[] args) {
		circle a1 = new circle();
		a1.redius=5;
		a1.area();
	}

}
