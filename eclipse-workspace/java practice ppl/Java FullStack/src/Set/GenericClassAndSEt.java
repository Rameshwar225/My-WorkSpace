package Set;

import java.util.*;

class Data<K, V>
{
	private K key;
	private V valuel;
	public Data(K key, V valuel) {
		
		this.key = key;
		this.valuel = valuel;
	}
	public K getKey() {
		return key;
	}
	public V getValuel() {
		return valuel;
	}
	@Override
	public String toString() {
		return "Data [key=" + key + ", valuel=" + valuel + "]";
	}
	
	
}
public class GenericClassAndSEt {

	public static void main(String[] args) {
		
		Set<Data>set = new LinkedHashSet<>();
		set.add(new Data("Key", "Value"));
		set.add(new Data(1, "one"));
		set.add(new Data(2, "Two"));
		set.add(new Data(3, "Three"));
		set.add(new Data(4, "Four"));
		set.add(new Data(5, "Five"));
		
		for(Data name: set)
		{
			System.out.println(name);
		}
		

	}

}
