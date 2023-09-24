package loop_control_instruction;
import java.util.Scanner;
public class Sum_of_natural_number {

	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the number");
           int n = sc.nextInt();
           int i;
           int sum=0;
           for(i=0;i<=n;i++)
           {
        	   sum=sum+i;
           }
           System.out.println(sum);
           
	}

}
