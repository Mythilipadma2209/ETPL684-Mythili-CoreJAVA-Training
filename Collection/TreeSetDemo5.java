package com.evergent.CoreJAVA.Collection;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetDemo5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		TreeSet mySet = new TreeSet();
		mySet.add(100);
		mySet.add(50);
		mySet.add(60);
		mySet.add(80);
		mySet.add(100);
		mySet.add(2);
		System.out.println(mySet);
		Iterator i = mySet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
