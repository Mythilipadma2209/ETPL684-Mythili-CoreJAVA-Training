package com.evergent.CoreJAVA.Collection;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
public class CF6_ArrayListIterator{
public static void main(String[] args) {
	List al = new ArrayList();
	al.add("Ramu");
	al.add("Ravi");
	al.add("Balu");
	al.add("Bhanu");		
	ListIterator li = al.listIterator();
	li.add("welcome");
	li.add("Hello");
	System.out.println(al);
	
	while(li.hasNext()) {
		String s =(String)li.next();
		System.out.println(s);
		if(s.equals("Balu"));
		li.remove();
	}
	System.out.println("After removing :");
	while(li.hasPrevious()) {
		System.out.println(li.previous());
	}
}
}







