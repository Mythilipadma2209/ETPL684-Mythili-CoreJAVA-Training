package com.evergent.CoreJAVA.ExceptionalHandling;

class InvalidScoreException extends RuntimeException{
	public InvalidScoreException(String message)
	{
		super(message);
	}
}
public class UserDefinedExceptionDemo12 {
	
	public static void validateScore(int Score) throws InvalidScoreException
	{	
		if (Score<0 || Score>100)
			throw new InvalidScoreException("Score must be Between 0 to 100");
		else
			System.out.println("Score is Valid");
	}

	public static void main(String[] args) {
		try {
			validateScore(110);
		}
		catch(InvalidScoreException e){
			System.out.println("caught the Exception "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program continues after Handling the exception");
	}

}
