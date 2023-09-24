package string;
import java.util.Scanner;
public class Different_methods_or_oerations_on_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String info = sc.nextLine() ;
		System.out.println("My name is "+ info);
	    
		int value = info.length();  //varriable_name.length() is use for find the length of given string 
		System.out.println(value);
		
		String lcase = info.toLowerCase();  //change to upper case to lower case string character.... 
		System.out.println(lcase);
		
	    String upper = info.toUpperCase();  //change to lower case to upper case string character....
	    System.out.println(upper);
	    
	    String space = info.trim();        //remove spaces from frond-end and back-end from the string(if spaces is available)
 	    System.out.println(space);
 	    
 	    String substring = info.substring(4);  //now start printing string from index 4  
 	    System.out.println(substring);         //index value start from 0;
 	    
 	    //we can alos pass staring and end point of the string
 	    
 	    String substring1 = info.substring(4,5);  //now start printing string from index 4 and stop printing at 6th index  
	    System.out.println(substring1);           //it does not include 6th element in the substring
 	    
	    String replace = info.replace('r','p');   //in our string r replace by p character
	    System.out.println(replace);              //we can replace more than one character but we need to use " " expect ' '
        
	    
	    boolean start = info.startsWith("ram");  //it show our string start with ram or not 
	    System.out.println(start);               //if yes then it print true   
	    
	    boolean end = info.endsWith("war");    //it show our string end with war or not
	    System.out.println(end);               //if yes then it print true  
	    
	    char at = info.charAt(4);          //it shows which character present at 4th index number
	    System.out.println(at);
	    
	    int index = info.indexOf("e");    //it shows the what is the index of e character 
	                                      //we can also add info.index("e",4) in here the compiler start searching from index 4
	    System.out.println(index);        //if in string have 2 same character then it shows index of 1st character 
	                                      //if match is not found then compiler print -1...
	    
	    boolean equal = info.equals("rameshwar"); //compare the given string to previous string
	    System.out.println(equal);
	    
	    
	    boolean equalcase = info.equalsIgnoreCase("RAMESHWAR");   //it ignore case censetive part in given string
	    System.out.println(equalcase);
	    
	    
	    
	}


}
