package com.evergent.CoreJAVA.Collection.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_LinkedList13_poll {
	public static void main(String[] args) {
		Deque <String> pq = new LinkedList<>();
		pq.add("Banana");
		pq.addFirst("Pineapple");
		pq.add("Watermelon");
		pq.addLast("Papaya");
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.pollLast());
		System.out.println(pq.pollFirst());
	}
}
