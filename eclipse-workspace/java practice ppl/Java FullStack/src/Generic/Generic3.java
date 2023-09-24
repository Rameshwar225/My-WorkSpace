package Generic;

class gen<k,v>
{
	private k key;
	private v value;
	public gen(k key, v value) {
		
		this.key = key;
		this.value = value;
	}
	public k getKey() {
		return key;
	}
	public v getValue() {
		return value;
	}
	
	public <E,N> void display(E element, N number)
	{
		System.out.println("Element: "+element + " Number: "+number);
	}
}
public class Generic3 {

	public static void main(String[] args) {
		gen<Integer,String> data = new gen<Integer,String>(1, "Rambo");
		data.display("Hello", 1000);
	}

}
