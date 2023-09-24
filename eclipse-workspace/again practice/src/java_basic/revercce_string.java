package java_basic;
import java.util.Scanner;
public class revercce_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		int i;
		
		String s = sc.nextLine();
		int l=s.length()-1;
		for(i=l;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}
