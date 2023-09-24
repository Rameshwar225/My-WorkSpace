package ObjectOriented;

public class ClassAndObject {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		c1.setName("Honda City");
		c1.setSpeed(80);
		c1.setDoor("Good");
		c1.setEngine("Jango");
		c1.setDriver("Sham");
		
		System.out.println(c1.run());
	}

}
