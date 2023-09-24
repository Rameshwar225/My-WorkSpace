package Generic;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class data1<t>
{
	private t  varname;
	
	public data1(t varname)
	{
		this.varname = varname;
	}
	
	
	public t getvarname()
	{
		return varname;
	}
}
public class Generic2 {

	public static void main(String[] args) {
		List<data1<Object>> name= new LinkedList<>();
		name.add(new data1<Object>("Rambo"));
		name.add(new data1<Object>("luxx"));
		name.add(new data1<Object>("Ramdas"));
		name.add(new data1<Object>(1));
		name.add(new data1<Object>('$'));
		name.add(new data1<Object>(12));
		
		printList(name);
	}
	
	static void printList(List<data1<Object>> list)
	{
		ListIterator<data1<Object>> i = list.listIterator();
		while(i.hasNext())
			
		{
			System.out.println("Element: "+ i.next().getvarname());
		}
	}

}
