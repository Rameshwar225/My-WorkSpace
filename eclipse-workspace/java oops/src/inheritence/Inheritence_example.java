package inheritence;
import java.util.Scanner;

class works
{
	String name;
	int number_of_work;
	void walk()
	{
		System.out.println("work completed: ");
	}
	void dark()
	{
		System.out.println("its too dark: ");
	}
	works()
	{
		System.out.println("This is the constructor of work class: ");
	}
}

class done extends works
{
	String name1;
	void done1()
	{
		System.out.println("Work is Done: ");
	}
	done()
	{
		System.out.println("This is the constructor of done class: ");
	}
	
	
}
public class Inheritence_example {

	public static void main(String[] args) {
		works w1 = new works();
		done d1 = new done();
		w1.name="Ram";
		w1.number_of_work=5;
		w1.dark();
		w1.walk();
		
		d1.dark();
		d1.walk();
		d1.done1();

	}

}
