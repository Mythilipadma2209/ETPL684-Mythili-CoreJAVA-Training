package com.evergent.CoreJAVA.Collection;
// LinkedHashSet :
//a. LinkedHashSet is a subclass of HashSet that maintains the insertion order of elements.
//b. This means that elements are added and retrieved in the same order they were inserted.
//c. Insertion order: Elements are stored and retrieved in the order they were added.
import java.util.LinkedHashSet;

public class CF13_LinkedHashSet {

	public static void main(String[] args) { //creating a LinkedHashSet
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Apple"); // Adding elements to the LinkedHashSet
		lhs.add("Banana");// Banana,Orange,Mango,Grapes.
		lhs.add("Orange");
		lhs.add("Mango");
		lhs.add("Grapes");
		// Displaying the LinkedHashSet
		System.out.println("LinkedHashSet :"+lhs);
		//Iterating through the LinkedHashSet
		System.out.println("Iterating overLinkedHashSet :");
		for(String fruit:lhs) {
			System.out.println(fruit);
		}
		// Checking if the set contains an element:Returns true if the this set Contains the Specified
		System.out.println("contains 'Mango' :"+lhs.contains("Mango"));
		// Removing an element
		lhs.remove("Banana");
		System.out.println("after removing 'Banana' :"+lhs);
		// Checking Size of the LinkedHashSet
		System.out.println("Size of LinkedHashSet:"+lhs.size());
		// Removing all the elements in the LinkedHashSet
		lhs.clear();
		System.out.println("After clearing:"+lhs);	
	}
}
