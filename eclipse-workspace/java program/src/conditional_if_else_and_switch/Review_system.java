package conditional_if_else_and_switch;
import java.util.Scanner;

public class Review_system {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the retting");
         int reting = sc.nextInt();
         switch(reting)
         {
         case 1 :   //when we have same data for case 1 and case 2 so we can write code this type
         case 2:
        	 System.out.println("bad review");
        	 break;
         case 3:
        	 System.out.println("Average review");
        	 break;
         case 4:
         case 5:
        	 System.out.println("best review");
        	 break ;
         }

	}

}
