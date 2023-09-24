package interfacess;

//here we create a interface of a
interface a
{  //interface means creat a only temple of methods without implimetation 
	int a=25; //we need to implements that method is a class which is imlementaed that
	void speed(int increement);
	
	void stop(int stay);
}
//here in class b we implements the interface which is present in interface a

class b implements a //we need to implements all methods which is present in interfaces
{
	//here we implents speed method in interface
	public void speed(int increement)
	{
		System.out.println("i am in b class");
	}

	//here we implements stop method in interface
	public void stop(int stay) {
		System.out.println("stop the car");
		
	}
}
//we can implements more than one interfaces in one class but we can not implements the abtract class  
//more than 1 time
public class intro_interfases {

	public static void main(String[] args) {
		
		//here we create a object of b class 
		b car = new b();
		car.speed(100);
		car.stop(0);
		System.out.println(a.a);//here we can also write system.out.println(car.a) for printing a
		
	}

}
