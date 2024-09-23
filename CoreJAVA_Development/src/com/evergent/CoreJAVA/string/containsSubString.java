package com.evergent.CoreJAVA.string;
// checks if string contains a specific substring
public class containsSubString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="The quick brown fox jumps over the lazy dogs";
		String substr="fox";
		boolean contains = str.contains(substr);
		System.out.println("contains '"+substr+"' :"+contains);
	}
}
