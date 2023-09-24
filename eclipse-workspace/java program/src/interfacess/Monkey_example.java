package interfacess;
interface basicanimal
{
	void eat();
	void sleep();
}
class monkey implements basicanimal
{
	void jump()
	{
		System.out.println("monkey was jumped");
	}
	void bite()
	{
		System.out.println("monkey bited to a ram");
	}
	
	public void eat() {
		System.out.println("monkey is eating");
		
	}
	
	public void sleep() {
		System.out.println("monkey is sleeping");
		
	}
}
class human extends monkey 
{

	
//	public void eat() {
//		System.out.println("human is eating");
//		
//	}
//
//	
//	public void sleep() {
//		System.out.println("ram was sleeped");
//		
//	}
	
}


public class Monkey_example {

	public static void main(String[] args) {
		human h1 = new human();
		h1.eat();
		h1.bite();
		h1.jump();
		h1.sleep();
		

	}

}
