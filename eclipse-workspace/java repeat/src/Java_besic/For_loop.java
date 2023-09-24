package Java_besic;
import java.util.Scanner;
public class For_loop {

	public static void main(String[] args) {
		int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to find table");
        int n = sc.nextInt();
        for(i=1;i<=10;i++)
        {
        	System.out.println(i*n);
        }
	}

}
