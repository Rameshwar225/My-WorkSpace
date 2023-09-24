package ObjectOriented;

class animal {
	public int hieght;
	public int waight;
	public String animalType;
	public String bloodType;

	public animal(int hieght, int waight, String animalType, String bloodType) {

		this.hieght = hieght;
		this.waight = waight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

}

class raptile extends animal {
	public raptile(int hieght, int waight, String animalType, String bloodType) {
		super(hieght, waight, animalType, bloodType);

	}

	public String skinType = "Dry skin";
	public boolean backbone = true;
	public String egeType = "Soft Shield";

	void showInfo() {

		System.out
				.print("the animal type is" + animalType + ", which have a " + skinType + " and egeType is " + egeType);
		if (backbone == true) {
			System.out.print(" and they also have backbone");
		} else {
			System.out.print("they dont have a backbone");
		}
		System.out.println("And the height and weight of this type of animal is " + hieght + " and" + waight
				+ " respectively. they have a  blood type is " + bloodType);

	}

}

class crocodile extends raptile {
	public crocodile(int hieght, int waight, String animalType, String bloodType) {
		super(hieght, waight, animalType, bloodType);
		this.backbone = false;
	}
	

	public String egeType = "hard Shield";

	public void showInfo() {
		System.out.println("this type of animal has "+hieght+" and waight "+ waight+ " animal type: "+ animalType+ " blood Type: "+ bloodType+" and backbone: "+backbone );

	}
}

class fish extends animal {
	public fish(int hieght, int waight, String animalType, String bloodType) {
		super(hieght, waight, animalType, bloodType);

	}

	public String shelter = "Water";
	public boolean gills = true;
}

class Ele extends fish {
	public Ele(int hieght, int waight, String animalType, String bloodType) {
		super(hieght, waight, animalType, bloodType);
		// TODO Auto-generated constructor stub
	}

	public String charge = "Ralease electric charge";

	public void showInfo() {

	}
}

class bird extends animal {
	public bird(int hieght, int waight, String animalType, String bloodType) {
		super(hieght, waight, animalType, bloodType);
		// TODO Auto-generated constructor stub
	}

	public boolean feather = true;
	public boolean canFly = true;
}

class egle extends bird {
	public egle(int hieght, int waight, String animalType, String bloodType) {
		super(hieght, waight, animalType, bloodType);
		// TODO Auto-generated constructor stub
	}

	public void info() {

	}
}

public class TypesOfInheritance {

	public static void main(String[] args) {
		raptile r1 = new raptile(5, 7, "Raptile", "Red");
		r1.showInfo();
		
		System.out.println("this is from crocodile class");
		crocodile c1 = new crocodile(12,80,"Raptile","pikish");
		c1.showInfo();

	}

}
