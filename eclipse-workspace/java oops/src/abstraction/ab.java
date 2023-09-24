package abstraction;

class lapy
{
	String name;
	protected int price;
	void setprise(int price)
	{
		this.price=price;
		System.out.println(this.price);
	}
}
public class ab {

	public static void main(String[] args) {
		lapy l1 = new lapy();
		l1.name="Asus";
		l1.setprise(48000);
	}

}
