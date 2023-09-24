package loop_control_instruction;

//series = 1-1/2+1/3-1/4+1/5-1/6........n

import java.util.Scanner;

public class Alternate_series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		float sum = 0;

		for (float i = 1; i <= n; i++) {
			if (i % 2 == 0)         //in our series we can the number which is has -sign they are even number 
			{
				sum = sum - 1 / i;  //thats why we use this condition    
			} else {
				sum = sum + 1 / i;
			}
		}
		System.out.println(sum);

	}

}
