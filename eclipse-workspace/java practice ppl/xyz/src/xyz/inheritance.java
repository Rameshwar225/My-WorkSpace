package xyz;

class car 
{
	protected String sound="'Tuurrrrr furrrrrr";
	void sound()
	{
		System.out.println(sound);
	}
	
}
class bike extends car
{
	int wheels;
	String color;
	bike(int wheels, String color)
	{
		System.out.println(sound+" "+ wheels+ " "+ color);
	}
}

class play extends bike
{

	play(int wheels, String color) {
		super(wheels, color);
		System.out.println(sound);
	}
	
}
public class inheritance {

	public static void main(String[] args) {
		play b1 = new play(4,"Red");
		
		

	}

}
