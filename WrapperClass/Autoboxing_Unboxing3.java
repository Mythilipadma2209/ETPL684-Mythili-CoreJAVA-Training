package com.evergent.CoreJAVA.WrapperClass;

public class Autoboxing_Unboxing3 {
	public static void main(String[] args) {
		// Autoboxing of Character
		char ch1='a';
	    Character ch2 = new Character(ch1);
		//Auto-unboxing of character
		char ch3=ch2.charValue();
		//print statements
		System.out.println("Value of :"+ch1);
		System.out.println("After Auto-Boxing :"+ch2);
		System.out.println("After Unboxing  : "+ch3);
	}
}
