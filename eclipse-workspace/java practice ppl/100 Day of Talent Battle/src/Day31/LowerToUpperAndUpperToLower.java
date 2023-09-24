package Day31;

public class LowerToUpperAndUpperToLower {

	public static void main(String[] args) {
		
		String str = "Hello";
		String s1 = "";
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				s1=s1+Character.toLowerCase(str.charAt(i));
			}
			else
			{
				s1=s1+Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(s1);

	}

}
