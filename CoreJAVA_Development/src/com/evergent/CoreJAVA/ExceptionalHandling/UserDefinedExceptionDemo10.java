package com.evergent.CoreJAVA.ExceptionalHandling;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
public class UserDefinedExceptionDemo10 {
	
	public static void checkAge(int age) throws InvalidAgeException
	{
		if (age <18)
			throw new InvalidAgeException("Age must be 18 or Older");
		else
			System.out.println("Access granted-You are old enough");
	}

	public static void main(String[] args) {
		try {
			
			checkAge(16);
		}
		catch(InvalidAgeException e){
			System.out.println("caught the Exception "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program continues after Handling the exception");
	}

}
