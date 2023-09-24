package constructor;

class human
{
	String name;
	int age;
	human(String name)
	{
		this.name = name;
	}
	human(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
}



public class Constructor_overloading {

	public static void main(String[] args) {
           //here we call that constructor who strored only name not the age
		human man = new human("ram");
		human women = new human("shila");
		System.out.println(man.name);
		System.out.println(women.name);
		
		
		
		System.out.println("******constructor overloading*****");
		
		//here we call that constructor who stored both name and age also
		human all = new human("Ram",20);
		human info = new human("shila",20);
		System.out.println("HEllo my name is "+all.name+" i am  "+all.age+" year old" );
		System.out.println("HEllo my name is "+info.name+" i am  "+info.age+" year old" );
	}

}
