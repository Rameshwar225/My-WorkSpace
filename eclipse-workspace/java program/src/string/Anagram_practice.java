package string;

import java.util.Arrays;

public class Anagram_practice {

	public static void main(String[] args) {
		String a="cbt";
		String b="act";
		
		a=a.replaceAll(" ", "");
		b=b.replaceAll(" ", "");
		
		if(a.length() != b.length())
		{
			System.out.println("Strig is not a anagram");
		}
		else
		{
			char c1[] = a.toLowerCase().toCharArray();
			char c2[] = b.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2))
				
			{
				System.out.println("Given strings are anagram");
			}
			else
			{
				System.out.println("Given strings are not anagram");
			}
			
		}
		
		
	}

}
