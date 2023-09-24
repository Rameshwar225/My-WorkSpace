package Multithreading;

class a extends Thread
{
	public void run()
	{
		System.out.println("thread is crearting");
	}
}

class b extends Thread
{
	public void run()
	{
		System.out.println("ek plyar ka nagma hai... mojoki ravani hai, jindgi aur kuch bhi nhi teri meri kahani haii...");
	}
}

public class example11 {

	public static void main(String[] args) {
       a a1 = new a();
       a1.run();
       b b1 = new b();
       b1.run();
	}

}
