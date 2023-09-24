package loop_control_instruction;
import java.util.Scanner;
public class Table_of_any_number {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number which you want  to print table");
         int n = sc.nextInt();
         
         for (int i = 1;i<=10;i++)
         {
        	 System.out.println(n*i);
         }
	}

}
