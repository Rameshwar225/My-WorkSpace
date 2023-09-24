package string;

import java.util.Arrays;

public class Anagram_new {

	public static void main(String[] args) {
		String a = "abt";
		String b = "cat";
		
		//first we need to remove all white spacess to we replace it by "";
		a = a.replaceAll(" ", "");
		b = b.replaceAll(" ", "");
		
		//now we check both strings have same size if no then print it is not a palimdrom
		if(a.length() != b.length())
		{
			System.out.println("it is not a anagram");
		}
		else
		{
			char c1[] = a.toLowerCase().toCharArray();
		    char c2[] = b.toLowerCase().toCharArray();
		    
		    Arrays.sort(c1);
		    Arrays.sort(c2);
		    
		    if(Arrays.equals(c1, c2))
		    {
		    	System.out.println("Given string is Anagram");
		    }
		    else
		    {
		    	System.out.println("string is not a Anagram");
		    }
		    
		}	
		
		
		
	}

}
