package Generic;

import java.util.*;

class g
{
	public<E> void printlist(List<E> list)
	{
		for(E element: list)
		{
			System.out.println(element);
		}
	}
	
	public<E> void printArray(E[] ArrayList)
	{
		for(E element: ArrayList)
		{
			System.out.println(element);
		}
	}
}

public class generic4 {
	
	public static void main(String args[])
	{
		System.out.println("**********List of a Interger: ************");
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		
		g g1 = new g();
		g1.printlist(l1);     
		
		System.out.println("**********List of a String: **********");
		List<String> s1 = new ArrayList<>();
		s1.add("Rambo");
		s1.add("Lux");
		s1.add("Ramdas");
		g1.printlist(s1);
		
		System.out.println("**********The elements in array**********");
		String[] array = {"Ramdas", "Lakhan", "Mi","CSK"};
		g1.printArray(array);
		
	}

}
