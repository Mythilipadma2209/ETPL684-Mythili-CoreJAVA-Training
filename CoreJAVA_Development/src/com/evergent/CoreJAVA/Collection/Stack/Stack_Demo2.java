package com.evergent.CoreJAVA.Collection.Stack;
// push - adding element to a stack
// pop - deleting the element from a stack
// peek - last element in the stack is displayed
import java.util.Stack;
public class Stack_Demo2 {
	public static void main(String[] args) {
		Stack mystack = new Stack();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		System.out.println(mystack);
		System.out.println(mystack.peek());
		System.out.println(mystack);
	}
}
