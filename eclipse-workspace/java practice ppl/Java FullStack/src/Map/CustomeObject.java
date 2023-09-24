package Map;

import java.util.*;
import java.util.Map.Entry;

class data
{
	private String lecturename;
	private String lecturenumber;
	
	public data(String lecturename, String lecturenumber) {
		super();
		this.lecturename = lecturename;
		this.lecturenumber = lecturenumber;
	}

	public String getLecturename() {
		return lecturename;
	}

	public String getLecturenumber() {
		return lecturenumber;
	}

	@Override
	public String toString() {
		return "data [lecturename=" + lecturename + ", lecturenumber=" + lecturenumber + "]";
	}
	
	
}
public class CustomeObject {

	public static void main(String[] args) {
		Map<data, String> m2 = new HashMap<>();
		m2.put(new data("1","s1"), "Hindi");
		m2.put(new data("2","s2"), "English");
		m2.put(new data("3","s3"), "Marathi");
		
		for(Entry<data, String> element: m2.entrySet())
		{
			System.out.println(element);
		}

	}

}
