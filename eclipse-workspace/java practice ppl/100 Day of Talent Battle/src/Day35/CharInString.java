package Day35;

import java.util.Scanner;

public class CharInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = sc.nextLine();
		
		char charArry[] = s1.toCharArray();
		int sum=0;
		
		for(int i=0;i<=charArry.length-1;i++)
		{
			if(Character.isDigit(charArry[i]))
			{
				sum=sum+Character.getNumericValue(charArry[i]);
			}
		}
		System.out.println(sum);

	}

}
