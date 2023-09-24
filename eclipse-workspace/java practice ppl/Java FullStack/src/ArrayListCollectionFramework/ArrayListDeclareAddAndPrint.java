package ArrayListCollectionFramework;

import java.util.ArrayList;

public class ArrayListDeclareAddAndPrint {
	
	ArrayList<String>listname = new ArrayList<>();
	public static void main(String[] args) {
		
		ArrayListDeclareAddAndPrint a1 = new ArrayListDeclareAddAndPrint();
		a1.listname.add("Ram");
//		we can do like making the object of ArrayListDeclareAddAndPrint class or we can make arraylist static after making static we don't have need to make the object of ArrayListDeclareAddAndPrint class we can directly use listname.add("Ram");
		
		a1.listname.add("Gosavi");
		a1.listname.add("Vakav");
		System.out.println(a1.listname.get(2)); // this is used for printing element using index 
		System.out.println(a1.listname);//this is used for print all elements from array
		

	}

}
