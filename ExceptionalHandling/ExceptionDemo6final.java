package com.evergent.CoreJAVA.ExceptionalHandling;
/*  
 16. try block followed by either catch block (or) finally block.
*/
public class ExceptionDemo6final {
	String name=null;
	public void myData() {
		try 
		{
			System.out.println("ONe");
			System.out.println(name.length());
			System.out.println("END");
		}	
		finally {
			System.out.println("Finally Block Class Connections");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo6final ed2=new ExceptionDemo6final();
		ed2.myData();
	}
}
