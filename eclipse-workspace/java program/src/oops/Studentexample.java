package oops;
class student
{
	String name;
	int age;
	public void printname()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
public class Studentexample {

	public static void main(String[] args) {
		student s1 = new student();
		s1.name="ram";
		s1.age = 19;
		s1.printname();

	}

}
