package com.evergent.CoreJAVA.ExceptionalHandling;
// throws is a keyword
// when we throws exception from a method, the calling method has to handle the exception 
public class ExceptionDemo7throws {
	String name=null;
	public void myData() throws Exception {
		
			System.out.println("ONe");
			System.out.println(name.length());
			System.out.println("END");
		}	
	public static void main(String[] args) {
		try 
		{
		ExceptionDemo7throws ed2=new ExceptionDemo7throws();
		ed2.myData();
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
