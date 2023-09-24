package XOR;

public class XOR {

	public static void main(String[] args) {
		
		String str = "Hello word";
		
		char ch[] = str.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++)
		{
			ch[i] = (char) (ch[i] & 127);
			
			System.out.println(ch[i]);
		}
		System.out.println("**********************");
		for(int j = 0;j<=ch.length-1;j++)
		{
			ch[j] = (char) (ch[j] ^ 127);
			System.out.println(ch[j]);
		}
		

	}

}
