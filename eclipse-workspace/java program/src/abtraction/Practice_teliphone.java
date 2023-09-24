package abtraction;
abstract class teliphone1
{
	abstract void ring(); 
	abstract void light();
	abstract void desconnected();
}
class smarteliphone1 extends teliphone1
{
	public void ring()
	{
		System.out.println("phone is ringing");
	}
	public void light()
	{
		System.out.println("light is on");
	}
	public void desconnected()
	{
		System.out.println("phone was disconnected");
	}




public class Practice_teliphone {

	public static void main(String[] args) {
		
		smarteliphone1 s1 = new smarteliphone1();
		s1.desconnected();
		s1.light();
		s1.ring();

	}

}


	
}
