package loop_control_instruction;
import java.util.Scanner;

public class power_of_number {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to find power: ");
        int a = sc.nextInt();
        System.out.println("enter the power: ");
        int b = sc.nextInt();
        
       int  result = 1;
       for(int i=0;i<b;i++)
       {
    	   result = result*a;
       }
       System.out.println(result);
	}

}
