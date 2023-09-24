
public class ANDXOR {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		
		char ch[] = str.toCharArray();
		int lenght = ch.length;
		
		for(int i=0;i<lenght;i++)
		{
			ch[i] = (char) (ch[i] & 127);
			System.out.println(ch[i]);
		}
		
		for(int i=0; i<lenght;i++)
		{
			ch[i] = (char) (ch[i] ^ 127);
			System.out.println(ch[i]);
		}

	}
}
