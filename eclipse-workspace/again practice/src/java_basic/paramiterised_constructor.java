package java_basic;
class Student1
{
	Student1(String s,int r,float m)
	{
		System.out.println("Name: "+s);
		System.out.println("Roll number: "+r);
		System.out.println("Marks: "+m);
	}
}
public class paramiterised_constructor {

	public static void main(String[] args) {
		Student1 s1 = new Student1("Ram",225,84.65f);
		System.out.println();
		Student1 s2 = new Student1("Vaishanavi",224,89.56f);
		System.out.println();
		Student1 s3 = new Student1("Priti",226,89.56f);
				
	}

}
