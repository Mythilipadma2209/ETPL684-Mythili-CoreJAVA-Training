package com.evergent.CoreJAVA.strings;
//StringBuffer Methods
public class StringBufferExamples {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello");
		System.out.println("Initial String :"+str);
		//Append a String
		str.append("World");
		System.out.println("After Append :"+str);
		//insert a string at a specific position
		str.insert(6,"Beautiful");
		System.out.println("After Insert :"+str);
		//replace a substring
		str.replace(0,5,"Hi");
		System.out.println("After Replace :"+str);
		//Delete a substring
		str.delete(0,3);
		System.out.println("After delete :"+str);
		//Reverse a String
		str.reverse();
		System.out.println("After Reverse :"+str);
		//Capacity and Length
		System.out.println("Capacity :"+str.capacity());
		System.out.println("Length :"+str.length());
	}
}
