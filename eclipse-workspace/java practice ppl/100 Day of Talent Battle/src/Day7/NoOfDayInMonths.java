package Day7;

import java.util.*;
public class NoOfDayInMonths {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		System.out.println("Enter the month: ");
		int month = sc.nextInt();
		
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			System.out.println("31");
		}
		else if(month==4||month==6||month==9||month==11)
		{
			System.out.println("30");
		}
		else if((month==2) && leap(year) )
		{
			System.out.println("29");
		}
		else if(month==2)
		{
			System.out.println("28");
		}
				
	}
	
	static boolean leap(int year)
	{
		if(year%400==0)
		{
			return true;
		}
		else if(year%100==0)
		{
			return false;
		}
		else if(year%4==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
		
	}

}
