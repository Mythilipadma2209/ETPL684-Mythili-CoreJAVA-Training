package com.evergent.CoreJAVA.ExceptionalHandling;
//14. throws an exception, it will be executed layer by layer (or) Method by Method
public class ExceptionDemo8throws {
	String name=null;
	public void myData() throws Exception {
		
			System.out.println("ONe");
			System.out.println(name.length());
			System.out.println("END");
		}	
	public void myChange() throws Exception{
		myData();
		System.out.println("My change method");
	}
	public static void main(String[] args) {
		try 
		{
		ExceptionDemo8throws ed8=new ExceptionDemo8throws();
		ed8.myData();
		}
		/*catch(NullPointerException e){
			System.out.println("I can handle :"+e);
		}
		*/
		catch(Exception e){
			System.err.println("I can handle :"+e);
		}
	}
}
