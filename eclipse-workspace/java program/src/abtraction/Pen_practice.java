package abtraction;

abstract class pen
{
	abstract void write();
	abstract void refil();
}
class fountainpen extends pen
{

	
	void write() {
		System.out.println("i am wrinting somthing with pen");
		
	}

	
	void refil() {
		System.out.println("i will change the refil of the pen");
		
	}
	void changenib()
	{
		System.out.println("nib of fountain pen was changed");
	}
	
	
}

public class Pen_practice {

	public static void main(String[] args) {
		fountainpen p1 = new fountainpen();
		p1.write();
		p1.refil();
		p1.changenib();
	}

}
