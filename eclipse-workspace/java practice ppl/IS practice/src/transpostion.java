
public class transpostion {

	public static void main(String[] args) {
		String str = "Hello word";
		String str1 = str.replaceAll(" ", "");
		
		int n=3;
		
		for(int i=0;i<str1.length();i++)
		{
			if(i%4==0)
				
			{
				System.out.println(str.charAt(i));
			}
		}
		
		for(int i=0;i<str1.length();i++)
		{
			if((i+1)%2==0)
				
			{
				System.out.println(str.charAt(i));
			}
		}
		
		for(int i=0;i<str1.length();i++)
		{
			if((i+2)%4==0)
				
			{
				System.out.println(str.charAt(i));
			}
		}
		
		

	}

}
