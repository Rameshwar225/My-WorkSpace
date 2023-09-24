package file_handling;
import java.io.File;
public class example1 {

	public static void main(String[] args) {
		try {
			File f1 = new File("C:\\Users\\91966\\Desktop\\my all project\\ram.txt");
			if(f1.createNewFile())
			{
				System.out.println("file is created as name: "+ f1.getName());
				
			}
			else {
				System.out.println("file is already exist");
			}
			
		}
		catch(Exception e){
			System.out.println("some error is occure");
		}
	}

}
