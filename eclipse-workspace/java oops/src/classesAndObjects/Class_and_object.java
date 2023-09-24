package classesAndObjects;

class Student
{
	String name;
	int Roll_Number;
	void total_marks(int a,int b, int c, int d, int e)
	{ 
		System.out.println("The total marks of is : "+ (a+b+c+d+e));
	}
}
public class Class_and_object {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Ram";
		s1.Roll_Number=225;
		s1.total_marks(35, 75, 56, 45, 49);

	}

}
