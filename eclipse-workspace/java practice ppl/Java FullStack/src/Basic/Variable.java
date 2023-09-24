package Basic;

class TypeOfVaribale {
	int a = 5;
	static int b = 7;

	void val() {
		int c = 10;
		System.out.println(c);
	}

}

public class Variable {

	public static void main(String[] args) {
		TypeOfVaribale t1 = new TypeOfVaribale();
		System.out.println("A is a Instance Varibale with value: " + t1.a);
		System.out.println("B is a Static varible with value: " + t1.b);
		System.out.print("C is a local Varibale with value: ");
		t1.val();
	}

}
