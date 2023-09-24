package conditional_if_else_and_switch;
import java.util.Scanner;

public class Student_pass_or_fail {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your marks");
       int marks = sc.nextInt();
       
       if(marks>=90 && marks<=100)
       {
    	   System.out.println("You are pass with outstanding");
       }
       else if(marks>=75 && marks<=89)
       {
    	   System.out.println("You pass with Distintion");
       }
       else if(marks>=50 && marks<=75)
       {
    	   System.out.println("you pass with A grade");
       }
       else if(marks>=35  && marks<=49)
       {
    	   System.out.println("you pass .....thanks god!!!");
       }
       else
       {
    	   System.out.println("you are fail.... so sad");
       }
       
	}

}
