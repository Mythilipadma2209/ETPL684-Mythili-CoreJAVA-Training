package com.evergent.CoreJAVA.Collection;
// Array List using ForEachLoop
import java.util.ArrayList;

public class CF12_ArrayList_ForEachObject {

	public static void main(String[] args) {
		ArrayList<Object> mylist = new ArrayList<>();
		mylist.add(100);
		mylist.add("Venu");
		mylist.add("Ramesh");
		mylist.add(45.5);
		for (Object o:mylist) {
			System.out.println(o);
		}
	}
}
