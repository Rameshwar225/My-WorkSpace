package ArrayListCollectionFramework;

import java.util.*;

class WrapInt
{
	public int value;
	
	public WrapInt(int val)
	{
		this.value=val;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
public class WrappingClassAndBoxingUnboxing {

	public static void main(String[] args) {
		
		ArrayList<Integer> student = new ArrayList<>(); //Pridefine wrapper class
		student.add(25); //autoboxing
		System.out.println(student.get(0)); // auto-unboxing
		
		
		ArrayList<WrapInt> studnetno = new ArrayList<>(); //user define wrapper class
//		studnetno.add(1); // this line shows error because it is a manual boxing we are going to use custome or we made wraper class so for that we need to boxing manualy like below.
		
		studnetno.add(new WrapInt(331)); //manual boxing
		System.out.println(studnetno.get(0).getValue()); // unboxing

	}

}
