package oops;

class Cat   //here we creat a class 
{
	String name,color; //this is the properties of our class
	int leg,eyes;
	
	public void eat()   //here we create a method 
	{
		System.out.println("Cat is eating somthing");
	}
	public void walk()  //here again we create a method
	{
		System.out.println("Cat is walking to-words the gate");
	}
	public void descripntion()
	{
		System.out.println("My cat name is "+name+" she's color is "+color);
		System.out.println("she have "+leg+" legs and "+eyes+" eyes,thats all about my cat");
	}
	
}




public class Main_class {

	public static void main(String[] args) {
		Cat cat1 = new Cat(); //here we create a object of that class
		Cat cat2 = new Cat(); //here we again create a object of  class
		//cat1.walk();   // here we call that method by object_name.method() fuction or systax
		//cat1.eat();   // here we call that method by object_name.method() fuction or systax
		//cat2.walk();  // here we call that method by object_name.method() fuction or systax
		//cat2.eat();   // here we call that method by object_name.method() fuction or systax
		cat1.name="kaju";
		cat2.name="jango";
		cat1.color="black";
		cat2.color = "black";
		cat1.leg=4;
		cat2.leg=4;
		cat1.eyes=2;
		cat2.eyes=2;
		cat1.descripntion();
		cat2.descripntion();
		
		
		

	}

}
