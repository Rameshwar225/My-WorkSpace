package Day18;

import java.util.*;
public class SumOfFraction {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int f = (a * d) + (b * c);
		int denominator = (b * d);
		System.out.println(f+"/"+denominator);

	}

}
