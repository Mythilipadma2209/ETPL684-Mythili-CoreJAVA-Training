package com.evergent.CoreJAVA.ExceptionalHandling;

/*class InvalidClothSizeException extends Exception{
	public InvalidClothSizeException(String message)
	{
		super(message);
	}
}*/
public class UserDefinedExceptionDemo14 {
	


	public static void main(String[] args) {
		/*try {
			
			checkSize("XLarge");
		}
		catch(InvalidClothSizeException e){
			System.out.println("caught the Exception "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("Program continues after Handling the exception");
		*/
		int s = 4;
		if (s<=5 || s>=9)
			System.out.println("Size must be Small,Medium or Large");
		/*if ((s=="Medium"))
			System.out.println("Size must be Small,Medium or Large");
	    if ((s=="Large"))
	    	System.out.println("Size must be Small,Medium or Large");
	    */
		else
			System.out.println("Size is Available");
		
	}

}
