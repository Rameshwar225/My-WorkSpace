package data_type_and_veriable;

public class Simple_Interest_with_initilize_values {

	public static void main(String[] args) {
		int time = 2;
		double rate = 12.5,si,total_amount;
		int principle = 5000;
       
		si = (time*rate*principle)/100;
		
		total_amount = si + principle; 
		
		System.out.print("the simple rate is: ");
		System.out.println(si);
		System.out.print("the total amount is: ");
		System.out.print(total_amount);
	}

}
