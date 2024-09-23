package com.evergent.CoreJAVA.string;
//printing a to z characters 
public class Stringperformance4 {
	public static void main(String[] args) {
		String series="";
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			series = series+ch;
		}
		System.out.println(series);
	}
}
