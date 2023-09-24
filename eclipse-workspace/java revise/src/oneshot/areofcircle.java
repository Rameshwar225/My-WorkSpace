package oneshot;
class Area
{
	float pi = 3.14f;
	int redius;
	void getredius(int r)
	{
		
		 this.redius=r;
	}
	void setarea()
	{
		float area1= pi*redius*redius;
		System.out.println("Area of circle is: "+area1);
	}
}
public class areofcircle {

	public static void main(String[] args) {
       Area a1 = new Area();
       a1.getredius(5);
       a1.setarea();
	}

}
