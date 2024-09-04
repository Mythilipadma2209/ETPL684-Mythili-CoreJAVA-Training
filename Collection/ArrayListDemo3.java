package com.evergent.CoreJAVA.Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		ArrayList myList = new ArrayList();
		myList.add(100);
		myList.add("Hello");
		myList.add(45.5);
		myList.add(100);
		
		System.out.println(myList);
		Iterator i = myList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
