package com.evergent.CoreJAVA.strings;
import java.util.Arrays;
public class Stringperformance5 {
	public static void main(String[] args) {
		String name="Java Technologies";
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.indexOf('T'));
		System.out.println("  JAVA  ".strip());
	}
}
