package file_handling;
import java.io.*;
public class bytestream {

	public static void main(String[] args) {
		try {
			FileReader f1 = new FileReader("C:\\Users\\91966\\Desktop\\my all project\\ram.txt");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try
		{
			FileWriter f2 = new FileWriter("C:\\Users\\91966\\Desktop\\my all project\\ram.txt");
			
		}
		catch(Exception e)
		{
			System.out.println("some erroe is occure ");
			e.printStackTrace();
		}

	}

}
