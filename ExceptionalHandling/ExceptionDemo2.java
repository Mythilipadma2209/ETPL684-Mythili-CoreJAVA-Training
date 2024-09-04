package com.evergent.CoreJAVA.ExceptionalHandling;
/*  3. All Exceptions are executed during abnormal conditions only.
	4. Normal flow it won’t execute any exceptions.
	5. Once any exceptions are occurring in java code, then remaining lines of code is unreachable.
*/
public class ExceptionDemo2 {
	String name="null";
	public void myData() {
		try 
		{
			System.out.println("ONe");
			System.out.println(name.length());
			System.out.println("END");
		}	
		catch(NullPointerException e){
			System.out.println("I can handle :"+e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo2 ed2=new ExceptionDemo2();
		ed2.myData();
	}
}
