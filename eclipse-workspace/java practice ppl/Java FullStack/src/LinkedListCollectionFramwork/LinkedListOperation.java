package LinkedListCollectionFramwork;

import java.util.*;

public class LinkedListOperation {

	public static  void main(String[] args) {

		LinkedList<String> name = new LinkedList<>();
		name.add("Ram");
		name.add("Sham");
		name.add("Ramdas");
		name.add("Kiran");
		name.add("Swaraj");
		name.add("Kiran");
		name.add("Punam");
		name.add("Akansha");
		
		display(name);
		System.out.println("*********************************");
		name.set(7, "Sejal");
		display(name);
		System.out.println("*********************************");
		name.remove(1);
		display(name);

	}

	static public void display(LinkedList<String> name) {
		for (String name1 : name) {

			System.out.println(name1);
		}
	}

}
