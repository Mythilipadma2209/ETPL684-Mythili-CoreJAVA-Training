package com.evergent.CoreJAVA.Collection.Stack;
// push - adding element to a stack
// pop - deleting the element from a stack
//peek - last element in the stack is displayed
//search - searching an element in the stack
// isEmpty - checks weather the stack is empty or not
import java.util.Stack;
public class Stack_Demo4 {
	public static void main(String[] args) {
		Stack mystack = new Stack();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		System.out.println(mystack);
		mystack.clear();
		boolean b = mystack.isEmpty();
		System.out.println(b);
		System.out.println(mystack);
	}
}
