package ObjectOriented;

class Vehical {
	private String engeen;
	private int wheels;
	private int seats;
	private String Cname;

	public Vehical() {
		this.engeen = "petrol";
		this.wheels = 2;
		this.seats = 2;
		this.Cname = "Honda";
	}

	public Vehical(String engeen, int wheels, int seats, String Cname) {
		this.Cname = Cname;
		this.engeen = engeen;
		this.wheels = wheels;
		this.seats = seats;
	}

	public String getEngeen() {
		return engeen;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeat() {
		return seats;
	}

	public String Cname() {
		return Cname;
	}
}

class Bike extends Vehical {
	private String handle;

	public Bike() {
		super();
		this.handle = "short";
	}

	public Bike(String handle) {
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

}

class Truck extends Vehical {
	private String tering;

	public Truck() {
		super();
		this.tering = "gol-gol";
	}

	public Truck(String tering, String engeen, int wheels, int seats, String Cname) {
		super(engeen, wheels, seats, Cname);
		this.tering = tering;
	}

	public String getTering() {
		return tering;
	}

}

class SuperCar extends Vehical {
	private String tering;
	
	public SuperCar()
	{
		super();
		this.tering="Ly bhari tering hy rao";
	}
	public SuperCar(String tering,String engeen, int wheels, int seats, String Cname)
	{
		super(engeen,wheels,seats,Cname);
		this.tering=tering;
	}
	public String getTering()
	{
		return tering;
	}
	public String toString()
	{
		return "SuperCar: tering: "+tering+" Engeen: "+getEngeen()+" Wheels: "+getWheels()+ " seats: "+getSeat()+" Caname: "+Cname();
	}
}

public class Inheritence {

	public static void main(String[] args) {

		Bike b1 = new Bike();
		System.out.println("**********This is the calling default Constructor**********");
		System.out.println(b1.getEngeen() + " " + b1.getHandle());

		Truck t1 = new Truck("Cercle", "Fast Engeen,", 12, 10, "Wolva");
		System.out.println("**********This is the calling parameterized Constructor**********");

		System.out.println(
				t1.getTering() + " " + t1.Cname() + " " + t1.getEngeen() + " " + t1.getSeat() + " " + t1.getWheels());
		
		
		System.out.println("Now the time is Car class......");
		SuperCar c1 = new SuperCar();
		System.out.println("this out is by using default Constructor");
		System.out.println(c1.getTering());
		SuperCar c2 = new SuperCar("Mast","Super Fast Rao",4,4,"Farari");
		System.out.println(c2);
		
	}

}
