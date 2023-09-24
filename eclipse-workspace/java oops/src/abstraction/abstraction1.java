package abstraction;
abstract class employ
{
	int salary;
	boolean reguler;
	void work()
	{
		System.out.println("complete work!");
	}
	
}
class viraj extends employ
{
	String name;
}
class ram extends employ
{
	String name;
}
public class abstraction1 {

	public static void main(String[] args) {
//		employ e1 = new employ(); we can not create a object of abstract class but we need to use that
//		time you can use the children of that class
		
		viraj v1 = new viraj();
		v1.name="viraj";
		v1.reguler=true;
		v1.salary=45000;
		
		ram r1 = new ram();
		r1.name="Ram";
		r1.reguler=true;
		r1.salary=5000;
		
		
		

	}

}
