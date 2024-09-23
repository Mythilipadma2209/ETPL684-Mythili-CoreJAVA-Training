package com.evergent.CoreJAVA.Collection.Queue;
// Addition : offer(),add()
// Retrieving : peek() : shows Header value
// Remove : poll,removing()
import java .util.PriorityQueue;
import java.util.Queue;
public class Queue_Demo4 {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue();
		pq.add(8);
		pq.add(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
