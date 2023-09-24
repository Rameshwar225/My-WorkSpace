package interfacess;
interface camera2
{
	//here we create a method in camera interface
	void takesnap();  
	void videorecoder();
	
	//this method is called default method and we does not need to implement in class we can implement 
	//this method in interface by using default keyword
	default void videorecord4k()
	{
		System.out.println("video recorded in 4k ");
	}
}
//here we create a 1 more interface
interface wifi2
{
   String[] wifiname();
   void connect();
}
//here we create class
class mycellphone2
{
	void incommingcall(int number)
	{
		System.out.println("taking a call"+number);
	}
	void recive()
	{
		System.out.println("call recived");
	}
}
//here we create class and implements both interfaces and also we do inheritence
class smartphone2 extends mycellphone2 implements camera2,wifi2
{
	public void takesnap()
	{
		System.out.println("snap taked");
	}
	public void videorecoder()
	{
		System.out.println("video recoded");
	}
	public String[] wifiname()
	{
		String[] name = {"galuxy","ram","kiran"};
		
		return name;

	}
	
	public void connect()
	{
		System.out.println("wifi connected...");
	}
}

public class Polymorphisn_in_interfaces {

	public static void main(String[] args) {
		camera2 t1 = new smartphone2(); //here we create a object of camera2 interface so now we cannot 
		t1.takesnap(); //use other methods outside the class here
		t1.videorecoder();
		t1.videorecord4k();
		//t1.connect --> this is not alowed cause we only create object of camera2 interface
		//so we can not use other methods in this object
	

	}

}
