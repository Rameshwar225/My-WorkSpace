package java_basic;
class animal
{
	String name;
	int waight;
	int hight;
	String type;
};
class dog extends animal
{
	int number_of_leg;
	String sound;
	void display()
	{
		System.out.println("I have a dog that name is "+name+"."+name+"has "+number_of_leg+" legs, with "+waight+" waight and "+hight+" feet");
		System.out.println("My dog always create nose with his own voice. hi do like "+sound);
	}
}
public class javainheritence {

	public static void main(String[] args) {
		dog d1 = new dog();
		d1.name="Tommay";
		d1.number_of_leg=4;
		d1.hight=3;
		d1.type="pet dog";
		d1.sound = "bhaubhau";
		d1.display();
				

	}

}
