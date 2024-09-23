package com.evergent.CoreJAVA.ExceptionalHandling;
/*  
 17. We should follow exceptions hierarchical.
*/
public class ExceptionDemo4 {
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
		catch(Exception e){
			System.out.println("I can handle :"+e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo4 ed2=new ExceptionDemo4();
		ed2.myData();
	}
}
