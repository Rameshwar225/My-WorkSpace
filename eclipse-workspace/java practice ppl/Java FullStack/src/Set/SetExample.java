package Set;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> setname = new HashSet<>();
		setname.add("Ram");
		setname.add("Lakhan");
		setname.add("Ramdas");
		setname.add("Ram");
		
		for(String name: setname)
		{
			System.out.println(name);
		}
		System.out.println(setname.contains("Rambo")); // this method returns true of false

	}

}
