package inheritence;
 
//here we create  a parent class which is name has person
class person
{ 
	protected String name;
	void walk()
	{
		System.out.println(name+" is walking");
	}
	void eat()
	{
		System.out.println(name+" is eating");
	}
}


//here we use properties of parent class in techer class by using inheritence and it is done by "extend" 
class teacher extends person                //world
{
	void teach()
	{
		System.out.println(name+" is teaching");
	}
}

//here we use properties os parent class in  singer class by using inheritence and it is done by "extend"
class singer extends person           //world
{
	void sing()
	{
		System.out.println(name+" is singing");
	}
}



public class Inheritence {

	public static void main(String[] args) {
		//here we create a object of teacher class
		teacher t1 = new teacher(); 
		t1.name = "Mr.Ram";
		t1.eat();
		t1.teach();
		t1.walk();
		
		//here we create a object of singer class
		singer s1 = new singer();
		s1.name = "yo yo h.singh ";
		s1.eat();
		s1.sing();
		s1.walk();

	}

}
