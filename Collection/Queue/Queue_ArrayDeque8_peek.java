package com.evergent.CoreJAVA.Collection.Queue;

import java.util.ArrayDeque;
public class Queue_ArrayDeque8_peek {
	public static void main(String[] args) {
		ArrayDeque <String> pq = new ArrayDeque<>();
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
