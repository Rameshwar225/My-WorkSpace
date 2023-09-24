package operator;

public class Operator_01 {

	public static void main(String[] args) {
		int a = 4;  
		int b = a + 5;   //here + is a operator
        int c = b % a;   // % operator is use for calculate reminder; 
         c += 2; // += use to add 2 in c 
		System.out.println(b);
		System.out.println(c);
		System.out.println(6==5); // here == use the compare 
		System.out.println(6==5 && 9 == 9); //here && work as and 
		System.out.println(6==5 || 9 == 9); //here || work as or 
	}

}
