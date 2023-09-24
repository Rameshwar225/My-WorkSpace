package ObjectOriented;

public class Car {
	
	private String name;
	private String engine; 
	private String door;
	private String driver;
	
	private int speed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String run()
	{
		String output="The name of a car is "+getName()+". which has speed "+getSpeed()+" with "+getDoor()+" doors";
		return output;
	}
}
