package com.evergent.CoreJAVA.WrapperClass;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList_WrappercClass4 {

	public static void main(String[] args) {
		// JDK 1.44
		int a=10;
		Integer i1 = new Integer(a);
		ArrayList myList = new ArrayList();
		myList.add(i1);
		Integer i2=new Integer(100);
		myList.add(i2);
		myList.add(new Integer(200));
		System.out.println(myList);
		
		//JDK 1.5
		ArrayList myList2 = new ArrayList();
		myList2.add(100);
		System.out.println(myList2.get(0));
		
	}
}
