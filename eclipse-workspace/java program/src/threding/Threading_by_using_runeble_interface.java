package threding;

//in this method we  implements runnable interface from our java compiler

class mythreads implements Runnable
{
	public void run()
	{
		for(int i=0;i<=100;i++)
		{
			System.out.println("hello 111111111");
		}
	}
}
class mythreads2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=50;i++)
		{
			System.out.println("hello 2222222");
		}
	}
}

public class Threading_by_using_runeble_interface {

	public static void main(String[] args) {
		//here we create a object of 1st class
		mythreads bullets = new mythreads();
		//here we create a object of Thread class which is we not create but our compiler already have that
		//we need to this cause we need to start our threading by using start method it is imposible to
		//do threading without start method
		Thread gun1 =new Thread(bullets);
		//here we call start method 
		gun1.start();
		
		mythreads2 bullets1 = new mythreads2();
		//here we create a object of Thread class which is we not create but our compiler already have that
		//we need to this cause we need to start our threading by using start method it is imposible to
		//do threading without start method
		Thread gun2 =new Thread(bullets1);
		//here we call start method 
		gun2.start();
	}

}
