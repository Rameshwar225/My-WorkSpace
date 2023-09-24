package Java_besic;
class apple
{
	final int price=50;
	int x;
	static void apple1(int y)
	{
		int x = y;
		System.out.println(++x);
		
	}
	
}
public class static_keyword {

	public static void main(String[] args) {
		apple a1 = new apple();
		a1.apple1(5);
		
		
		
	}

}
