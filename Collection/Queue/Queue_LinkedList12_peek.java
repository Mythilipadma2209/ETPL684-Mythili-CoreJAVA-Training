package com.evergent.CoreJAVA.Collection.Queue;

import java.util.LinkedList;
import java.util.Deque;

public class Queue_LinkedList12_peek {
	public static void main(String[] args) {
		Deque <String> pq = new LinkedList<>();
		pq.add("Banana");
		pq.addFirst("Pineapple");
		pq.add("Watermelon");
		pq.addLast("Papaya");
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.peekLast());
		System.out.println(pq.peekFirst());
	}
}
