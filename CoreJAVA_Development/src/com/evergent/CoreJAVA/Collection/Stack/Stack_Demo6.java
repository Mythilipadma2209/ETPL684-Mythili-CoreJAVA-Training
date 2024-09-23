package com.evergent.CoreJAVA.Collection.Stack;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Iterator;

public class Stack_Demo6 {

	public static void main(String[] args) {
		Stack<String> mystack = new Stack<> ();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		System.out.println(mystack);
		System.out.println("Enumeration Iteratpor");
		Enumeration e = mystack.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("Iterator...");
		Iterator i = mystack.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("For Each adv Loop....");
		for(String s : mystack)
			System.out.println(s);
	}
}
