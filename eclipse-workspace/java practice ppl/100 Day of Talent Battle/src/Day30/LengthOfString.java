package Day30;

public class LengthOfString {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		int length = 0;
		int i = 0;
		while (true) {
		    try {
		        char c = s1.charAt(i);
		        length++;
		        i++;
		    } catch (IndexOutOfBoundsException e) {
		        break;
		    }
		}
		System.out.println(length);

	}

}
