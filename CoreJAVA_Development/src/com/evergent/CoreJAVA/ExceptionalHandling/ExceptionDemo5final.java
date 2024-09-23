package com.evergent.CoreJAVA.ExceptionalHandling;
//13. Finally is a block, if exceptions occurs or not finally block will be executed.
public class ExceptionDemo5final {
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
		finally {
			System.out.println("Finally Block Class Connections");
		}
	}
	public static void main(String[] args) {
		ExceptionDemo5final ed2=new ExceptionDemo5final();
		ed2.myData();
	}
}
