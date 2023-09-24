package java_basic;
import java.io.*;
public class streams {

	public static void main(String[] args) {
		try
		{
			FileInputStream f1 = new FileInputStream("C:\\Users\\91966\\Desktop\\my all project\\Ram.txt");
			System.out.println("file created successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try
		{
			FileOutputStream f2= new FileOutputStream("C:\\Users\\91966\\Desktop\\my all project\\Ram.txt");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
