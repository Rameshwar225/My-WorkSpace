package Encapsulation;

class a 
{
	public void m()
	{
		System.out.println("tum to dhehre pardesi.......  sath kya nibhaoge...!");
	}
	void a1()
	{
		System.out.println("aata tari deva mala pavshil ka...?");
	}
}

class b extends a
{
	public void m()
	{
		System.out.println("mosam hyyy mastana girlfriend nastana.....");
	}
	b()
	{
       System.out.println("tuzya priticha ha inchu mala chavl..");		
	}
}
public class danamicexample {

	public static void main(String[] args) {
		a a1 = new b();
		a1.a1();
		a1.m();
	}

}
