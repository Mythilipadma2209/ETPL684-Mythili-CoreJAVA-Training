package com.evergent.CoreJAVA.Collection;
import java.util.HashSet;
import java.util.Iterator;
public class CF11_HashSet_Generics {

	public static void main(String[] args) {
		HashSet<String> mylist=new HashSet<String>();
		mylist.add("hi");
		mylist.add("hello");
		mylist.add("Everyone");
		mylist.add("Bye");
		System.out.println(mylist);
		Iterator i =mylist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for (String s:mylist) {
			System.out.println(s);
		}
	}
}
