package java_basic;
class Student
{
	String name;
	int roll_number;
	float marks;
	
	public void display(String s,int r,float m)
	{
		System.out.println("Name: "+s);
		System.out.println("Roll number: "+r);
		System.out.println("marks: "+m);
	}
};
public class class_and_object {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display("Ram", 225, 84.56f);
		System.out.println();
		s1.display("Sham", 226, 90.45f);
		System.out.println();
		s1.display("vaishanvi", 224, 98.56f);
		

	}

}
