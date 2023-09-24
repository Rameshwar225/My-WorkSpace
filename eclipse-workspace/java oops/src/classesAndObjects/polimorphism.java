package classesAndObjects;

class add
{
	int number;
	void add()
	{
		int n1 = number+1;
		System.out.println(n1);
	}
	void add(int n2)
	{
		int n3=1+n2;
		System.out.println(n3);
	}
}
public class polimorphism {

	public static void main(String[] args) {
		
     add a1 = new add();
     a1.number=5;
     a1.add();
     a1.add(1);
	}

}
