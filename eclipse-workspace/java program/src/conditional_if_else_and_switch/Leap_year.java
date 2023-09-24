package conditional_if_else_and_switch;
import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the year:  ");
         int year =sc.nextInt();
         if(year%4==0)
         {
        	 System.out.println("this is the leap year");
         }
         else
         {
        	 System.out.println("this is not a leap year");
         }
	}

}
