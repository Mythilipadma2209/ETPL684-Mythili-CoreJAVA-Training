package com.evergent.CoreJAVA.ExceptionalHandling;
//21. If there are 2 exceptions in try, developer should handle 1st exception after that 2nd exception will
//    be handled.
public class ExceptionDemo3 {
	String name="null";
	int k=0;
	public void myData() {
		try 
		{
			System.out.println("ONe");
			System.out.println(name.length());
			System.out.println("END");
			int t=10/k;
			System.out.println(t);
		}	
		catch(NullPointerException e){
			System.out.println("I can handle :"+e);
		}
		catch(ArithmeticException e){
			System.out.println("I can handle :"+e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo3 ed2=new ExceptionDemo3();
		ed2.myData();
	}
}
