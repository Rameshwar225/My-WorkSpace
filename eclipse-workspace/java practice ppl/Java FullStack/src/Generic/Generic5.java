package Generic;

class genericFive 
{
	
	// here we used inheritence because of we want to k have only character and E have number or for restriction
	public <K extends Character,E extends Number> void display(K key, E Element)
	{
		System.out.println("Key: "+ key + " Element: "+ Element);
	}
}
public class Generic5 {

	public static void main(String[] args) {
		genericFive f1 = new genericFive();
		f1.display('A', 2);
				

	}

}
