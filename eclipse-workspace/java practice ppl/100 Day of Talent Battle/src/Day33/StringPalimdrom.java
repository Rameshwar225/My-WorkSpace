package Day33;

import java.util.Scanner;

public class StringPalimdrom {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		String s3 = s1.toLowerCase();
		
		String s2="";
		for(int i=s3.length()-1;i>=0;i--)
		{
			s2=s2+s3.charAt(i);
		}
	
		if(s3.equals(s2))
		{
			System.out.println("Palimdrom");
		}
		else
		{
			System.out.println("Not palimdrom");
		}
			

	}

}
