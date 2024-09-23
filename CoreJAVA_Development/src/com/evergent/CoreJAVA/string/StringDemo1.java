package com.evergent.CoreJAVA.string;
//Compares the address memory location
public class StringDemo1 {

	public static void main(String[] args) {
		String str1=new String("JAVA");
		String str2=new String("JAVA");
		if(str1==str2) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}

	}

}
