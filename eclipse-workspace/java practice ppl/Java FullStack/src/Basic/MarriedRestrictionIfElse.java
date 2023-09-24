package Basic;
import java.util.*;

public class MarriedRestrictionIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of the Boy");
		int ageOfBoy = sc.nextInt();
		System.out.println("Enter the age of the Girl");
		int ageOfGirl = sc.nextInt();
		
		if(ageOfBoy>=21 && ageOfGirl >= 18)
		{
			System.out.println("They can marrie with each other");
		}
		else
		{
			System.out.println("They can't marrie with each other");
		}

	}

}
