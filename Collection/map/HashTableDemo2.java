package com.evergent.CoreJAVA.Collection.map;
import java.util.Hashtable;
public class HashTableDemo2 {

	public static void main(String[] args) {
		Hashtable mymap=new Hashtable();
		mymap.put(100,"Ramesh");
		mymap.put(200,"Bhanu");
		mymap.put(300,"Abbas");
		mymap.put(100,"welcome");
		mymap.put(null,"abc");
		mymap.put(700,null);
		
		System.out.println(mymap);
	}
}
