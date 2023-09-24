package ArrayListCollectionFramework;

import java.util.ArrayList;

public class ModifyTheArraylist {

	static ArrayList<String> listname2 = new ArrayList<>();
	public static void main(String[] args) {
		
		listname2.add("Hinglaj");
		listname2.add("Kusum");
		listname2.add("kalyan");
		listname2.add("Suman");
		listname2.add("Ram");
		listname2.add("Lakhan");
		
		ModifyTheArraylist arraylist2 = new ModifyTheArraylist();
		System.out.println("**********Before opration*********");
		arraylist2.display(listname2);
		
		System.out.println("**********modify the arraylist using index directly**********");
		arraylist2.modifyarrylist(1, "Pooja");
		arraylist2.display(listname2);
		
		System.out.println("**********modify the arraylist using search**********");
		arraylist2.modifyarrylist(arraylist2.search("Pooja"), "Kusum");
		arraylist2.display(listname2);
//		
	}
	public void display(ArrayList<String> names)
	{
		for(String name: names)
		{
			System.out.println(name);
		}
	}
	
	public void modifyarrylist(int index, String name)
	{
		listname2.set(index, name);
	}
	
	
	
	
	public int search(String name)
	{
		return listname2.indexOf(name);
	}

}
