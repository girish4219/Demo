package com.jmz.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {

	public static void main(String[] args) {
PriorityQueue<Integer> q=new PriorityQueue<Integer>();
q.add(1);
q.add(2);
System.out.println(q);
Integer q1=new Integer(3);
//q1.add(3);
//q1.add(4);
System.out.println(q1);
q.offer(q1);
System.out.println(q);
System.out.println("--------------------------------");
a();
	}
	static void a() {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("2");
		pq.add("4");
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.offer("1");
		pq.offer("10");
		System.out.println(pq);
		pq.add("3");
		System.out.println(pq);
		pq.remove("1");
		System.out.println(pq.poll());
		if(pq.remove("2"))
			System.out.println(pq.peek());
		System.out.println(pq.poll()+"  "+pq.peek());
	}

}
