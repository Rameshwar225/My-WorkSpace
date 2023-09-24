package conditional_if_else_and_switch;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("1.Name");
	    System.out.println("2.Roll number");
	    System.out.println("3.Class");
	    System.out.println("4.exit");
	    
	    System.out.println("Enter your choice");
	    int a = sc.nextInt();
	    
	    switch(a)
	    {
	    case 1:
	    	System.out.println("Your name is Rameshwar");
	    	break;
	    case 2:
	    	System.out.println("your roll number is 225");
	    	break;
	    case 3:
	    	System.out.println("Your class is SE comp: ");
	    	break;
	    case 4:
	    	System.out.println("this is switch case");
	    	break;
	    default :
	    	System.out.println("Enter correct choice");
	    
	    }
	    

	}

}
