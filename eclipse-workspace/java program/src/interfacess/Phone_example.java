package interfacess;
interface camera
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
interface wifi
{
   String[] wifiname();
   void connect();
}
//here we create class
class mycellphone
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
class smartphone extends mycellphone implements camera,wifi
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

public class Phone_example {

	public static void main(String[] args) {
		
		//here we create a object of mycellphone class
		mycellphone c1  =new mycellphone();
		c1.incommingcall(696577686);
		c1.recive();
		
		
		//here we create a object a smartphone class
		smartphone s1 = new smartphone();
		s1.takesnap();
		s1.videorecoder();
		s1.videorecord4k();
		//here we use for each loop for printing all elements in  string array
		String[] arr =s1.wifiname();
		
		for(String item:arr)
		{
		System.out.print(item+" ");
		}
		System.out.println();
		s1.connect();
		
		

	}

}
