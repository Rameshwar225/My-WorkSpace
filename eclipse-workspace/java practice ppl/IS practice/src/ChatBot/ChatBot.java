package ChatBot;

import java.util.Scanner;

public class ChatBot {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name: ");
		String str = sc.nextLine();
		
		System.out.println("Welcome "+str+" How can i help you");
		System.out.println("Please select the book from our book store which you want to buy");
		System.out.println("1. Aladin");
		System.out.println("2. Mahabharat");
		System.out.println("3. Vikram betal");
		System.out.println("4. Yakshini");
		System.out.println("5. The God");
		
		int n = sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("ohh greate thank for chooseing the Aladin Book!!! please provide your contact number");
			 long number = sc.nextLong();
			System.out.println("Thank you we will get back to you");
			break;
		case 2:
			System.out.println("ohh greate thank for chooseing the Mahabharat Book!!! please provide your contact number");
			long number1 = sc.nextLong();
			System.out.println("Thank you we will get back to you");
			break;
			
		case 3:
			System.out.println("ohh greate thank for chooseing the Vikram betal Book!!! please provide your contact number");
			long number2 = sc.nextLong();
			System.out.println("Thank you we will get back to you");
			break;
			
		case 4:
			System.out.println("ohh greate thank for chooseing the Yakshini Book!!! please provide your contact number");
			long number3 = sc.nextLong();
			System.out.println("Thank you we will get back to you");
			break;
			
		case 5:
			System.out.println("ohh greate thank for chooseing the The God Book!!! please provide your contact number");
			long number4 = sc.nextLong();
			System.out.println("Thank you we will get back to you");
			break;
		}
		

	}

}
