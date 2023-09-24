package Basic;

public class TypeCasting {

	public static void main(String[] args) {
		byte var = 1;
		double var2 = var;
		System.out.println("This is the implicit type casting (we convert byte to double): "+var2);
		
		byte var3 = (byte)var2;
		System.out.println(var3);
	}

}
