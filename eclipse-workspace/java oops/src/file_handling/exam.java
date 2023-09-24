package file_handling;
import java.io.*;
public class exam {

	public static void main(String[] args) throws IOException {
		File f1 = new File("Ram.txt");
		if(f1.createNewFile())
		{
			System.out.println("file zali ryyy create");
		}
		else 
		{
			System.out.println("hyachya aaila aala bg ky tri error..");
		}
	}

}
