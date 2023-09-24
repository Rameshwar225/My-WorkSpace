package data_type_and_veriable;
import java.util.Scanner;
public class Cgpa_calculation {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your subject marks");
    int subject1 = sc.nextInt();
    int subject2 = sc.nextInt();
    int subject3 = sc.nextInt();
    float avr = (subject1 + subject2 + subject3)/3;
    float cgpa = avr/10;
    System.out.println("Your CGPA is: ");
    System.out.print(cgpa);
	}

}
