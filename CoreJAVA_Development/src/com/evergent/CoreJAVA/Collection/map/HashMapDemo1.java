package com.evergent.CoreJAVA.Collection.map;
import java.util.HashMap;
public class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap mymap=new HashMap();
		mymap.put(100,"Ramesh");
		mymap.put(2000,"Bhanu");
		mymap.put(300,"Abbas");
		mymap.put(100,"welcome");
		mymap.put(null,"abc");
		mymap.put(700,null);
		mymap.put(null,"xyz");
		mymap.put(600,null);
		
		System.out.println(mymap);
	}
}