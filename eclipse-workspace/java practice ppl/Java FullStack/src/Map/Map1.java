package Map;

import java.util.*;
import java.util.Map.Entry;

public class Map1 {

	public static void main(String[] args) {
		
		Map<Integer, String> student = new HashMap<>();
		student.put(1, "Ram");
		student.put(4, "Lax");
		student.put(2, "Lakhan");
		student.put(3, "Ramdas");
		student.put(5, "Max");
		
		for(Entry<Integer, String> element: student.entrySet()) //this is the one way of print map element
		{
			System.out.println(element);
		}
		
		System.out.println(student.get(2)); // this is used to print element
		
		

	}

}
