package oops;
import java.util.Scanner;
class ram
{
	String name,address;
	long contact_number;
	public void info()
	{
		System.out.println("My name is "+name+" ,I am from "+address+" and my contact number is "+contact_number);
	}
}

public class Main_practice {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	ram ds = new ram();
	System.out.println("Enter your name: ");
	ds.name = sc.nextLine();
	System.out.println("Enter your address: ");
	ds.address = sc.nextLine();
	System.out.println("Enter your contact number: ");
	ds.contact_number = sc.nextLong();
	
	ds.info();
	
	

	}

}
