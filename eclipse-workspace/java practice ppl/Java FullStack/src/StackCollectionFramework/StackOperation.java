package StackCollectionFramework;

import java.util.*;
public class StackOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer>number = new Stack<>();
		
		number.push(1);//insert elements in stack
		number.push(2);
		number.push(10);
		number.push(15);
		number.push(18);
		number.push(20);
		number.push(250);
		number.push(100);
		for(int n: number)
		{
			System.out.print(n+" ");
		}
		number.peek();
		number.pop();//remove last inserted element
		number.peek();//check which element is present on top of the stack
		System.out.println(number.isEmpty()); //return false
		System.out.println(number.search(18)); // return index of that element
		System.out.println(number.search(150)); // return -1
		

	}

}
