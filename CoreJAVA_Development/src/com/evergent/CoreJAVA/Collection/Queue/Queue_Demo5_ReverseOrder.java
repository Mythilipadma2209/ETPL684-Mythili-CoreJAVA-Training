package com.evergent.CoreJAVA.Collection.Queue;
// Addition : offer(),add()
// Retrieving : peek() : shows Header value
// Remove : poll,removing()
import java .util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
public class Queue_Demo5_ReverseOrder {
	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(8);
		pq.add(2);
		pq.add(5);
		pq.add(9);
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}
