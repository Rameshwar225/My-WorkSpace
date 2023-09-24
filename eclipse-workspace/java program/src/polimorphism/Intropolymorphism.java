package polimorphism;
class animal
{
	public void walk()
	{
		System.out.println("animal is walking ");
	}
	
}
class pet extends animal
{
	public void walk()
	{
		System.out.println("pet is walking");
		
	}
}
class dog extends pet
{
	public void walk()
	{
		System.out.println("dog is walking");
	}
}





public class Intropolymorphism {

	public static void main(String[] args) {
		
		dog d = new dog();
		pet p = d;
		animal a = d;
		d.walk();
		p.walk();
		a.walk();
		
	}

}
