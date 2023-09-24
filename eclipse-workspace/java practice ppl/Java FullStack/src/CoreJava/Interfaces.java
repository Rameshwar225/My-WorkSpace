package CoreJava;

interface Phone
{
	String prosessor();
	int price();
	
}
class Sansung implements Phone
{

	
	public String prosessor() {
		
		return "SD789";
	}

	
	public int price() {
		
		return 19999;
	}
	
}
class Iphone implements Phone
{

	
	public String prosessor() {
		
		return "IP1022";
	}

	
	public int price() {
		
		return 120000;
	}
	
}
public class Interfaces {

	public static void main(String[] args) {
		
		Phone p1 = new Sansung();
		System.out.println("The processor of phone is "+p1.prosessor()+" And price is "+p1.price());
		
		System.out.println("***************************************************************");
		
		Phone p2 = new Iphone();
		System.out.println("The processor of phone is "+p2.prosessor()+" And price is "+p2.price());

				

	}

}
