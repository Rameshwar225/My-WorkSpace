package CoreJava;

class finalvariable
{
	private final int x = 10;

//	public finalvariable(int x) {
//		
//		this.x = x;
//	}

	public finalvariable() {
		super();
		
	}

	public int getX() {
		return x;
	}
	
	
}

public class FinalKeywordVariable {

	public static void main(String[] args) {
		finalvariable f1 = new finalvariable();
		System.out.println(f1.getX());
		
//		finalvariable f2 = new finalvariable(15);
//		System.out.println(f2.getX());
	}

}
