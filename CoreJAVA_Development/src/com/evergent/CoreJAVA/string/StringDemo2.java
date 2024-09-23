package com.evergent.CoreJAVA.string;
//compares the content of the string
public class StringDemo2 {

	public static void main(String[] args) {
		String s1="JAVA";
		String s2="JAVA";
		if(s1==s2) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
		if (s1.equals(s2)) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}

}
