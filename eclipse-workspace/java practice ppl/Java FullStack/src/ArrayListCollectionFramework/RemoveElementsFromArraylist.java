package ArrayListCollectionFramework;

import java.util.ArrayList;

public class RemoveElementsFromArraylist {
	
	static ArrayList<String> listname = new ArrayList<>();
	public static void main(String[] args) {
		listname.add("Hinglaj");
		listname.add("Kusum");
		listname.add("kalyan");
		listname.add("Suman");
		listname.add("Ram");
		listname.add("Lakhan");
		
		RemoveElementsFromArraylist arraylist1 = new RemoveElementsFromArraylist();
		System.out.println("**********Before opration*********");
		arraylist1.display(listname);
		System.out.println("**********After remove element by using index***********");
		arraylist1.removeElementsbyIndex(1);
		arraylist1.display(listname);
		
		System.out.println("**********After remov elements by using value***********");
		arraylist1.removeElementsbyvalue("Hinglaj");
		arraylist1.display(listname);
		

	}
	public void display(ArrayList<String> names)
	{
		for(String name: names)
		{
			System.out.println(name);
		}
	}
	
	public void removeElementsbyIndex(int index)
	{
		listname.remove(index);
	}
	public void removeElementsbyvalue(String name)
	{
		listname.remove(name);
	}

}
