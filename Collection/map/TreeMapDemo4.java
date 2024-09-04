package com.evergent.CoreJAVA.Collection.map;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapDemo4 {

	public static void main(String[] args) {
		TreeMap<Integer,String> StudentRecords=new TreeMap<>();
		StudentRecords.put(102,"Raju");
		StudentRecords.put(101,"Bhanu");
		StudentRecords.put(103,"Ramu");
		StudentRecords.put(104,"David");
		System.out.println(StudentRecords);
		System.out.println("Student Record (Sorted by ID) :");
		for(Map.Entry<Integer,String> entry : StudentRecords.entrySet()) {
			System.out.println("ID :"+entry.getKey()+" Name :"+entry.getValue());
		}		
	}
}
