package loop_control_instruction;
import java.util.Scanner;

public class Fibbonacci_series_upto_n_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt(); //the fibbonacci series is when a = 0 & b=1 then c= a+b
		int a = 0;           //again now a = 1 & b = c and c = a+b; 
		int b = 1;            
		
		System.out.print(a+" ");//first we print 1st fabbonacci number
		System.out.print(b+" "); //then second but when user put vaule 8 that time we already print a and
		for(int i = 0;i<n-2;i++) // b so we need to do 8-2=6 and thats why we write i<n-2
		{
			int c= a+b;         //here we declare c 
			System.out.print(c+" "); //here we print c
			a=b;   //here we exachange values
			b=c;
			
		}

	}

}
