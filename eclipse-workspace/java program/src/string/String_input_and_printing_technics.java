package string;
import java.util.Scanner;
public class String_input_and_printing_technics {

	public static void main(String[] args) {
//		String name = "ram is a good boy"; //for printing strings
//		System.out.println(name);
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");        
		String name = sc.nextLine();   //use for user input
        
        //Different way to print data in JAVA
        System.out.println(name);      //regular way
        System.out.print(name);        //print without new line;
        System.out.printf("%s",name);  //print data like c language 
        System.out.format(name);       //same work like c language
        
        
	}

}
