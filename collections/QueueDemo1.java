package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {
	public static void main(String[] args) {
		Queue queue = new LinkedList();
		
		
		queue.offer(10);
		queue.offer(11);
		queue.offer(11);
		queue.offer(11);
		queue.offer(1);
		
		System.out.println(queue);
		System.out.println(queue.poll()+" return and removes");
		System.out.println(queue.peek()+" return the first element of queue");
		System.out.println(queue.remove()+ " removes and return ");
		System.out.println(queue.element());
		System.out.println(queue);
		
	}
}
