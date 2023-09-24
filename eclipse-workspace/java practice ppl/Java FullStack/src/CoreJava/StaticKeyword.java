package CoreJava;

class stat
{
	private static int  number =0;

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		stat.number = number;
	}
	
	
}
public class StaticKeyword {

	public static void main(String[] args) {
		
		System.out.println(stat.getNumber());
		stat.setNumber(5);
		System.out.println(stat.getNumber());
		
		stat obj2 = new stat();
		System.out.println(stat.getNumber()); //if we apply the static keyword that time value of number is 5 but when we remove static keyword from number then value of number again 0

	}

}
