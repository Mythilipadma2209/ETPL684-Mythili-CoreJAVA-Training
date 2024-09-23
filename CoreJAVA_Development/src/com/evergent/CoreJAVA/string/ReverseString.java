package com.evergent.CoreJAVA.string;
//reverse the order of the string 
public class ReverseString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello, World!";
		StringBuilder reversed = new StringBuilder(str).reverse();
		System.out.println(reversed);
	}
}
