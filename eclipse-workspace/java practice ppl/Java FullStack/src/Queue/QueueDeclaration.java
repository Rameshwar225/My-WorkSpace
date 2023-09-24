package Queue;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueDeclaration {

	public static void main(String[] args) {
		System.out.println("***********LinkedList**********");
		Queue<Integer> queue = new LinkedBlockingQueue<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		for(int i: queue)
		{
			System.out.println(i);
		}
		
		System.out.println("***********ArrayQueue**********");
		Queue<Integer> queue1 = new ArrayBlockingQueue<>(5); // five is size of a aaray
		queue1.add(1);
		queue1.add(2);
		queue1.add(3);
		queue1.add(4);
		queue1.add(5);
		
		for(int i: queue1)
		{
			System.out.println(i);
		}
		
		
	}
}
