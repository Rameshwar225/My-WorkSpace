package xyz;

class student
{
	private String name;
	private String clg; 
	
	student(String name, String clg)
	{
		this.name = name;
		this.clg = clg;
		
	}
	void info()
	{
		System.out.println("the name of the studnets is: "+ name +" from "+ clg);
	}
}

public class ObjectCreation {

	public static void main(String[] args) {
		student s1 = new student("Ram", "SVPM");
		s1.info();

	}

}
