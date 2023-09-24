package Set;

import java.util.*;

public class TypesOfSets {

	public static void main(String[] args) {
		System.out.println("***************Using Hashset**************");
		Set<String> s1 = new HashSet<>();
		for(int i=5;i>0;i--)
		{
			s1.add("a: "+i);
		}
		for(String name:s1)
		{
			System.out.println(name);
		}
		
		System.out.println("***************Using LinkedHashset**************");
		Set<String> s2 = new LinkedHashSet<>();
		for(int i=5;i>0;i--)
		{
			s2.add("a: "+i);
		}
		for(String name:s2)
		{
			System.out.println(name);
		}
		
		System.out.println("***************Using Treeset**************");
		Set<String> s3 = new TreeSet<>();
		for(int i=5;i>0;i--)
		{
			s3.add("a: "+i);
		}
		for(String name:s3)
		{
			System.out.println(name);
		}

	}

}
