package interfacess;
interface rg
{
	void a1();
	void a2();
}
interface rg1 extends rg //here we inherite the interface rg to rg1
{                        //now we can use all methods in rg in rg1
	void b1();
	void b2();
}
class result implements rg1
{

	@Override
	public void a1() {
		System.out.println("in a1");
		
	}

	@Override
	public void a2() {
     System.out.println("in a2");		
	}

	@Override
	public void b1() {
		System.out.println("in b1");
		
	}

	@Override
	public void b2() {
		System.out.println("in b2");
	}


	
}


public class Inheritence_in_interfacs {

	public static void main(String[] args) {
		result r1 = new result();
		r1.a1();
		r1.a2();
		r1.b1();
		r1.b2();
		

	


	}
}
