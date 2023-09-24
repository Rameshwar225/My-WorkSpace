package string;

public class String_is_palimdrom_or_not {

	public static void main(String[] args) {
		String a = "nitin";
		String p = "";
		int n = a.length();
		int i;
		for(i=n-1;i>=0;i--)
		{
			p = p+a.charAt(i);
		}
		System.out.println(p);
	
		if( a.equals(p))
		{
			System.out.println("given string is palimdrom");
		}
		else
		{
			System.out.println("Given string is not palimdrom");
		}

	}

}
