package dynamic_dispatch;
class phone
{
	public void ring()
	{
		System.out.println("chal chaiya chaiya chaiya chaiya...!");
	}
	void on()
	{
		System.out.println("phone is turning on...");
	}
}
class smartphone extends phone
{
	public void song()
	{
		System.out.println("bhula dena muze hai alwida tuze");
	}
	void on()
	{
		System.out.println("smart phone turning on");
	}
}
public class example {

	public static void main(String[] args) {
		phone p1= new smartphone();
		p1.ring();
//	    p1.song();
		p1.on();
	}

}
