package oneshot;
import java.io.*;
public class file {

	public static void main(String[] args) {
      try {
		FileInputStream f1 = new FileInputStream("C:\\Users\\91966\\Desktop\\java lectures\\ram1.txt");
		System.out.println("file created succsessfully");
	} catch (FileNotFoundException e) {
		System.out.println("some error is found at that file"+ e);
//		e.printStackTrace();
	}
	}

}
