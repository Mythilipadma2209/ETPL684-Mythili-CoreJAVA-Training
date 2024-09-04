package com.evergent.CoreJAVA.Collection;
import java.util.LinkedList;
public class CF8_Linkedlist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList mylist = new LinkedList();
		mylist.add("TATA");
		mylist.add("BMW");
		mylist.add("VOLVO");
		mylist.addFirst("Maruti");
		mylist.addLast("Safari");
		mylist.remove(4);
		System.out.println(mylist);
		mylist.clear();
		System.out.println(mylist);
	}

}
