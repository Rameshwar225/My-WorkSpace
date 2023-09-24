package loop_control_instruction;
import java.util.Scanner;

public class Sum_of_series {

	public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number: ");
          int n = sc.nextInt();
          float sum = 0;
          
          for(float i =1; i<=n;i++ )
          {
        	  sum=sum+1/i;
          }
          System.out.println(sum);
        		
        		  
	}

}
