package CoreJava;

class OuterClass {

	int x = 10;

	static class InnerClass {
		int y = 53;
	}
}

public class InnerClassStaticExample {
	
	public static void main(String[] args) {
		
		OuterClass.InnerClass myInner = new OuterClass.InnerClass();
		System.out.println(myInner.y);
	}

}