package polimorphism;

public class Compiler_time_polimorphism {

	public static void main(String[] args) {
		
		greating();
		greating("Ram");
		

		

	}
	//here we create a two same fuction but with different arguments that is called as fuction overloading
	public static void greating()
	{
		System.out.println("heey");
	}
	//and fuction overloading is known as compilertime polimorphism
	public static void greating(String s)
	{
		System.out.println(s);
	}
	

}
