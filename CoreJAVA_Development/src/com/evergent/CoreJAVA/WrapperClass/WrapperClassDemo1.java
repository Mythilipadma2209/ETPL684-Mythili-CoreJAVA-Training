package com.evergent.CoreJAVA.WrapperClass;

public class WrapperClassDemo1 {
	public static void main(String[] args) {
		// Auto data type to objects
		int a=10;
		Integer i1 = new Integer(a);
		System.out.println("Auto data type objects :"+i1);
		
		//Object data convert into datatype
		int a1=i1.intValue();
		System.out.println("Object data convert into datatype : "+a1);
	}
}
