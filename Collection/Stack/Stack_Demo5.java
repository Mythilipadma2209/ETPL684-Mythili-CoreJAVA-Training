package com.evergent.CoreJAVA.Collection.Stack;
// push - adding element to a stack
// pop - deleting the element from a stack
//peek - last element in the stack is displayed
//search - searching an element in the stack
//isEmpty - checks weather the stack is empty or not
import java.util.Stack;
public class Stack_Demo5 {
	public static void main(String[] args) {
		Stack mystack = new Stack();
		// adding the elements to a stack
		mystack.push("Apple");
		mystack.push("Banana");
		mystack.push("Cherry");
		mystack.push("Date");
		// display the elemnts in the stack
		System.out.println(mystack); 
		String topElement = (String) mystack.peek(); //peek
		System.out.println("Top Element : "+topElement);
		String removeElement = (String) mystack.pop(); //pop
		System.out.println("Stack After pop : "+mystack);
		// checking weather the stack isempty or not
		boolean b = mystack.isEmpty();
		System.out.println(b);
		//Searching()
		int position = mystack.search("Banana");
		System.out.println("position of 'Banana' from top :"+position);
		// clearing the data in stack
		mystack.clear();
		System.out.println("Stack after clearing :"+mystack);
	}
}
