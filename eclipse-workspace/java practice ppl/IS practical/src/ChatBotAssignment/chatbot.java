package ChatBotAssignment;

import java.util.Scanner;

public class chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Hello! Welcome to our bookstore. My name is Bookbot. What's your name?");
        

        String customerName = scanner.nextLine();
        System.out.println("Nice to meet you, " + customerName + "!");
        
        
        System.out.println("What kind of books are you interested in? Please type your answer below.");
        String customerInterests = scanner.nextLine();
        
        
        System.out.println("Great! Based on your interests in " + customerInterests + ", we recommend the following books:");
        System.out.println("- 'The Alchemist' by Paulo Coelho");
        System.out.println("- 'To Kill a Mockingbird' by Harper Lee");
        System.out.println("- 'The Catcher in the Rye' by J.D. Salinger");
        System.out.println("Do you have any specific questions about these books or anything else? such as price or recommned");
        
        
        String customerResponse = scanner.nextLine();
        if (customerResponse.contains("price")) {
            System.out.println("The price for each book is 199.");
        } else if (customerResponse.contains("recommend")) {
            System.out.println("Based on your interests in " + customerInterests + ", we also recommend 'The Great Gatsby' by F. Scott Fitzgerald and 'Pride and Prejudice' by Jane Austen.");
        } else {
            System.out.println("I'm sorry, I don't understand. Can you please rephrase your question or comment?");
        }
        
        
        System.out.println("Thank you for visiting our bookstore, " + customerName + ". We hope to see you again soon!");
    }
}
