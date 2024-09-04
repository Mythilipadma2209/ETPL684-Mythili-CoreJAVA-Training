package com.evergent.CoreJAVA.Collection.Queue;
import java.util.ArrayDeque;

public class Queue_ArrayDeque6 {
	public static void main(String[] args) {
		ArrayDeque <String> pq = new ArrayDeque<>();
		pq.add("Ravi");
		pq.add("Bhanu");
		pq.add("Shankar");
		pq.add("Chandu");
		System.out.println(pq);
		System.out.println(pq.peek());
	}
}
