package com.evergent.CoreJAVA.ExceptionalHandling;

public class ExceptionDemo18_multiple_throws {
	String name="Null";
	int k=0;
	public void myData() throws NullPointerException,ArithmeticException{
		System.out.println("ONe");
		System.out.println(name.length());
		int d=10/k;
		System.out.println(d);
		System.out.println("End");
	}
	public static void main(String[] args){
		try
		{
			ExceptionDemo18_multiple_throws ed = new ExceptionDemo18_multiple_throws();
			ed.myData();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}	
	}
}
