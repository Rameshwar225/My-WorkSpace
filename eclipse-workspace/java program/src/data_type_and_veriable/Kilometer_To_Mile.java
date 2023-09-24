package data_type_and_veriable;
import java.util.Scanner;
public class Kilometer_To_Mile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the kilomitters: ");
		float km = sc.nextFloat();
		float mile = km/3;
		System.out.println("The conversion km to mile is " + mile);
		

	}

}
