package Iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class interator {

	public static void main(String[] args) {

		List<String> name = new LinkedList<>();
		name.add("Ram");
		name.add("Sham");
		name.add("Ramdas");
		name.add("Kiran");
		name.add("Swaraj");
		name.add("Kiran");
		name.add("Punam");
		name.add("Akansha");

		iterato(name);
		System.out.println("*******************");
		name.sort(null);// used to sort
		iterato(name);
		System.out.println("********************");
		Collections.reverse(name);// used to reverse current order
		iterato(name);
	}

	public static void iterato(List<String> name) {
		Iterator<String> i = name.iterator();
		while (i.hasNext()) {
			System.out.println("Element: " + i.next());
		}
	}

}
