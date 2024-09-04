package com.evergent.CoreJAVA.Collection.Stack;
// push - adding element to a stack
// pop - deleting the element from a stack
//peek - last element in the stack is displayed
// search - seraching an element in the stack
import java.util.Stack;
public class Stack_Demo3 {
	public static void main(String[] args) {
		Stack mystack = new Stack();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		System.out.println(mystack.search("White"));
		System.out.println(mystack);
	}
}