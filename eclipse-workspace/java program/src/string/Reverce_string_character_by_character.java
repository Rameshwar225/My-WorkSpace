package string;

public class Reverce_string_character_by_character {

	public static void main(String[] args) {
		String a = "Hello ram";
		String r = "";
		int n = a.length();
		int i;
		for(i=n-1;i>=0;i--)
		{
			r = r+a.charAt(i);
		}
		System.out.println(r);
	}

}
