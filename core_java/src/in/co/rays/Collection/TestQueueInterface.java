package in.co.rays.Collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueueInterface {
	
	public static void main(String[] args) {
		
		Queue q = new LinkedList();
		q.add(2.3);
		q.add(222);
		q.add(42.03);
		q.add(21.36);
		q.add("Rays");
		
		System.out.println(q);		
		System.out.println(q.contains(222));
		
		Queue Pq = new PriorityQueue<>();
		Pq.add(1);
		//System.out.println(Pq);
		//Pq.remove();
		Pq.poll();		
		System.out.println(Pq.poll());
		
		
		Deque d = new LinkedList<>();
		d.add(1);
		d.add(21);
		d.add(31);
		d.add(41);
		d.add(51);
		
		System.out.println(d);
		
		d.addFirst(4567);
		d.addLast(565656565);
		System.out.println(d);
		
		
		
	}

}
