package loop_control_instruction;

public class Sum_of_100_numbers {

	public static void main(String[] args) {
		int sum = 0;
		int n = 100;
		for(n=1;n<=100;n++)
		{
			sum = sum+n;
		}
		System.out.println(sum);
	}

}
