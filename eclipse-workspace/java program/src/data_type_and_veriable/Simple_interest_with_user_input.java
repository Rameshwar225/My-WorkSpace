package data_type_and_veriable;
import java.util.Scanner;
public class Simple_interest_with_user_input {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the time  ");
		int time = sc.nextInt();
		System.out.println("Enter the rate ");
		double rate = sc.nextDouble();
		System.out.println("Enter the principle ");
		int principle = sc.nextInt();
       
		double  si = (time*rate*principle)/100;
		
        double total_amount = si + principle; 
		
		System.out.print("the simple rate is: ");
		System.out.println(si);
		System.out.print("the total amount is: ");
		System.out.print(total_amount);
	}

}
