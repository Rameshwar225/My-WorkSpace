package conditional_if_else_and_switch;
import java.util.Scanner;

public class Website_URL {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter website");
         String website = sc.nextLine();
         if(website.endsWith(".com"))
         {
        	 System.out.println("This is comertial website");
         }
         else if(website.endsWith(".org"))
         {
        	 System.out.println("this is organization website");
         }
         else if(website.endsWith(".in"))
         {
        	 System.out.println("this is indian website");
        	
         }
         else
         {
        	 System.out.println("website not found");
         }
	}

}
