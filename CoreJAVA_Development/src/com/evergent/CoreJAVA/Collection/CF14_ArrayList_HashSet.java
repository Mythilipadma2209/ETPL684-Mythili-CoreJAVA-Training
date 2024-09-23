package com.evergent.CoreJAVA.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public class CF14_ArrayList_HashSet {
	public static void main(String[] args) {
		List<String> list = new ArrayList <String>();
		list.add("CoreJAVA");
		list.add("J2EE");
		list.add("J2SE");
		list.add("myJAVA");
		System.out.println(list);
		
		Set<String> s= new HashSet<String>();
		s.addAll(list);
		System.out.println(s);
		
		Set<String> s1= new HashSet<>();
		s1.add("CoreJAVA");
		s1.add("J2EE");
		s1.add("J2SE");
		s1.add("myJAVA");
		s1.add("CoreJAVA");
		if (s.equals(s1)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
		System.out.println(s1);
	}
}
