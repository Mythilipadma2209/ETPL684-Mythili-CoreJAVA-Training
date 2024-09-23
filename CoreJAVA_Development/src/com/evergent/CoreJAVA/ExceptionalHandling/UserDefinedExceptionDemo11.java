package com.evergent.CoreJAVA.ExceptionalHandling;

class InsufficientfundsException extends Exception{
	public InsufficientfundsException(String message)
	{
		super(message);
	}
}
public class UserDefinedExceptionDemo11 {
	
	public static void withdraw(Double amt) throws InsufficientfundsException
	{	
		Double bal=500.00;
		if (amt > bal)
			throw new InsufficientfundsException("Insufficient funds for withdraw");
		else
			System.out.println("Withdraw Successful");
	}

	public static void main(String[] args) {
		try {
			withdraw(600.00);
		}
		catch(InsufficientfundsException e){
			System.out.println("caught the Exception "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program continues after Handling the exception");
	}

}
