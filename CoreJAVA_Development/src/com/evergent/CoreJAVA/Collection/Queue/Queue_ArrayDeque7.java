package com.evergent.CoreJAVA.Collection.Queue;

import java.util.ArrayDeque;
public class Queue_ArrayDeque7 {
	public static void main(String[] args) {
		ArrayDeque <String> pq = new ArrayDeque<>();
		pq.add("Banana");
		pq.addFirst("Pineapple");
		pq.add("Watermelon");
		pq.addLast("Papaya");
		pq.offerFirst("Kiwi");
		pq.offer("Apple");
		pq.addLast("Mango");
		System.out.println(pq);
		System.out.println(pq.size());
		
		Boolean t = pq.isEmpty();
		System.out.println(t);
		pq.clear();
		System.out.println(pq);
	}
}
