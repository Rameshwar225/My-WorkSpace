package incapsulation;

public class Student {
	private String name;
	private int age;
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
	   if(age>20)
	   {
		   System.out.println("Your are not student ");
	   }
	   else
	   {
		   this.age = age;
		   
	   }
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
