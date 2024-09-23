package com.evergent.CoreJAVA.ExceptionalHandling;

public class StachOverflowExample16 {
	public static void recursiveMethods() {
		recursiveMethods();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			recursiveMethods();
		}
		catch(StackOverflowError e)
		{
			System.out.println(" StackOverflowError caught:"+e.getMessage());
	    }		
    }
	
}