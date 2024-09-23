package com.evergent.CoreJAVA.ExceptionalHandling;

public class ArrayIndexOutOfBoundExceptionDemo13 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		try {
			System.out.println("Accessing the element at index 10:"+arr[10]);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
