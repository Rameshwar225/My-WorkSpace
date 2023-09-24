package constructor;

class auto
{
	int wheel;
	int head_light;
	auto(int no_of_wheels,int no_head_light) //when we want the name of veriable and parameter is same
	{                                        //that time we use "This keyword"
		wheel = no_of_wheels;                //in given example we remove no_of_wheels = wheel  
		head_light = no_head_light;          //that time we need to write a  this keyword     
	}                                        //sysnatx: 
}                                            //this.wheel = wheel  

public class Parametrerise_constructor {

	public static void main(String[] args) {
		
		auto car = new auto(4,2);
		auto scooty = new auto(2,1);
		
		System.out.println("the car have "+car.wheel +" wheels and "+car.head_light +" head light ");
		System.out.println("the scooty have "+scooty.wheel +" wheels and "+scooty.head_light +" head light ");		
		
	}

}
