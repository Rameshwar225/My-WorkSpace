package ObjectOriented;


class person
{
	private String name;
	private int age;
	private int salary;
	
	person(String name,int age,int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
//	public void setName(String name)
//	{
//		this.name=name;
//	}
//	public String getName()
//	{
//		return name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public int getSalary() {
//		return salary;
//	}
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//	
	public String toString()
	{
		return "name of person is " +this.name +" and his age is "+ this.age + " with the salary "+ this.salary;
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args) {
		
		person ram = new person("Ram",21,30000);
		System.out.println(ram);

	}

}
