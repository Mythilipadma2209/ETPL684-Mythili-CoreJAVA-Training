package com.evergent.CoreJAVA.strings;
//split the text on spaces
public class SplitDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is a powerful programming Language";
		String[] words =str.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		for (String w:words) {
			System.out.println(w);
		}
	}
}
