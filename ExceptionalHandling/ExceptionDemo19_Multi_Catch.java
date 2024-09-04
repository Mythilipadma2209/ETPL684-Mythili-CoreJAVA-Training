package com.evergent.CoreJAVA.ExceptionalHandling;

public class ExceptionDemo19_Multi_Catch {
	String name="Null";
	int k=0;
	public void myData() throws NullPointerException,ArithmeticException{
		try {
		System.out.println("ONe");
		System.out.println(name.length());
		int d=10/k;
		System.out.println(d);
		System.out.println("End");
		}
		catch(NullPointerException |ArithmeticException  e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo19_Multi_Catch ed = new ExceptionDemo19_Multi_Catch();
		ed.myData();
	}
}
