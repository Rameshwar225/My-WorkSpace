package ObjectOriented;

class car2 {
	private String name;
	private int wheels;
	private int seats;
	private Engine engine; //here it is a composition 

	public car2(String name, int wheels, int seats) {

		this.name = name;
		this.wheels = wheels;
		this.seats = seats;
	}
	public Engine getEngine()
	{
		return engine;
	}

}

class Engine {
	private int horsepower;

	public Engine(int horsepower) {
		this.horsepower = horsepower;
	}
	public void start()
	{
		System.out.println("Engine Started");
	}

}

public class Composition {

	public static void main(String[] args) {
		Engine e1 = new Engine(404);
		car2 c1 = new car2("honda",4,4);
		e1.start();

	}

}
