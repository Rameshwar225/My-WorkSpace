package treeMap;

import java.util.*;
import java.util.Map.Entry;

public class TreeMap1 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>();
		map.put(1, "Java");
		map.put(2, "python");
		map.put(3, "C");
		map.put(4, "C++");
		map.put(5, "HTML");
		
		for(Entry<Integer, String> m1: map.entrySet())
		{
			System.out.println(m1.getKey() + m1.getValue());
		}

	}

}
