package array;
import  java.util.Scanner;
public class Avrage_marks_calculator {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter how many students presen in your class: ");
       int n = sc.nextInt();
       int marks[] = new int[n];
       for(int i=0;i<n;i++)
       {
    	   System.out.println("enter "+(i+1) +" student marks");
    	  
    	   marks[i]=sc.nextInt();
       }
       int avrage=0;
       for(int i=0;i<n;i++)
       {
    	   avrage =avrage+marks[i];
       }
       System.out.println("avrage marks is: "+avrage/n);
       
       
       
       
	}

}
