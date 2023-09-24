package exception_handling;

import java.util.Scanner;

public class Try_catch1 {

	public static void main(String[] args) {
		//here we get input from user
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		//if user give value of b is 0 that time error may be ocure cause divide 0 is not possible in
		//any operation thats why we use  try block here
		
		//if b is not zero that time compailer exicute try block
		//else compiler exicute catch block
		try
		{
		     int c = a/b;
 		     System.out.println(c);
		}
		//here we declare block catch  
		catch(Exception e)
		{
			System.out.println("we fail to divide: reason "+e);
		}
		System.out.println("end of the program");
		}
	
	//if  here we didnot use try block that time next part of that program is not executed
	//but now compailer exicute that code which is after for try and catch block
	

}
