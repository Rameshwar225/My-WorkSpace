package incapsulation;

public class Into {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setAge(19);
		s1.setName("Ram");
		System.out.println(s1.getAge());
		System.out.println(s1.getName());

	}

}
