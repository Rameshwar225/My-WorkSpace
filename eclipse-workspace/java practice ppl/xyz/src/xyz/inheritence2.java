package xyz;

class Addd
{
	int a;
	int b;
	void additon(int a, int b)
	{
		System.out.println("Addition is: "+ (a+b));
	}
}

class sub extends Addd
{
	 int a;
	 int b;
	 void substraction(int a, int b)
	 {
			 System.out.println("substraction is: "+ (a-b));
				 
	 }
	 super.additon(a+b);
}
class cal extends sub

public class inheritence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
