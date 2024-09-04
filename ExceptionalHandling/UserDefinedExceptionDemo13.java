package com.evergent.CoreJAVA.ExceptionalHandling;
class InvalidClothSizeException extends Exception{
	public InvalidClothSizeException(String message)
	{
		super(message);
	}
}
public class UserDefinedExceptionDemo13 {
	public static void checkSize(String s ) throws InvalidClothSizeException
	{
		if ((s!="Small") && (s!="Medium") && (s!="Large"))
			throw new InvalidClothSizeException("Size must be Small,Medium or Large");
		else
			System.out.println("Size is Available");
	}
	public static void main(String[] args) {
		try {			
			checkSize("XLarge");
		}
		catch(InvalidClothSizeException e){
			System.err.println("caught the Exception "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program continues after Handling the exception");	
	}
}