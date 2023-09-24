package string;

public class Anagram_strings {

	public static void main(String[] args) {
	String a = "cat";
	String b= "actt";
	boolean isAnagram = false;
	boolean checked[] = new boolean[b.length()];
	
	
	if(a.length()==b.length())
	{
	
	for(int i=0;i<a.length();i++) //here we find lenght of 1st string
	{
		char c = a.charAt(i);   //here we strore all charaters in c;
		isAnagram =false;
		for(int j=0;j<b.length();j++)//here we find lenght of 2nd string
		{
			if(b.charAt(j)==c  && !checked[j]) //here we compare 1st string charater to the 2nd string character
			{
				checked[j] = true;
				isAnagram = true;
				break;
			}
		}
		if(!isAnagram)
		{
			break;
		}
	}
	}
	if(isAnagram)
	{
		System.out.println("Given string is anagram");
	}
	else
	{
		System.out.println("Given string is not anagram");
	}

	}

}
