package com.evergent.CoreJAVA.CaseStudy1;

public class LibraryUserMainClass {
	public static void main(String[] args) {
		LibraryUser kiduser1 = new KidUsers();
		System.out.println("\n \t\t\t Test Case-1 \n");
		try
		{
			kiduser1.register_Acc(10); // o/p - Successful registration 
			kiduser1.requestBook("Kids");// o/p - successfully book is issued
		}
		catch(AgeRestrictionException | BookTypeException e) 
		{
			System.out.println("\n"+e);
		}
		try 
		{
			kiduser1.register_Acc(18); // o/p - AgeRegstrictionException
		}
		catch(AgeRestrictionException e)
		{
			System.out.println("\nAge=18 :"+e);
		}
		try 
		{
			kiduser1.requestBook("Fiction"); // o/p - BookTypeException
		}
		catch(BookTypeException e)
		{
			System.out.println("\nBookType=Fiction :"+e);
		}
		
		System.out.println("\n\n \t\t\t Test Case-2 \n");
		LibraryUser adultuser1 = new AdultUsers();
		try
		{
			adultuser1.register_Acc(23); 			// o/p - Successful registration
			adultuser1.requestBook("Fiction");		// o/p - successfully book is issued
		}
		catch(AgeRestrictionException | BookTypeException e) 
		{
			System.out.println("\n"+e);
		}
		try 
		{
			adultuser1.register_Acc(5); // o/p - AgeRestrictionException
		}
		catch(AgeRestrictionException e) 
		{
			System.out.println("\nAge=5 :"+e);
		}
		try
		{
			adultuser1.requestBook("Kids"); // o/p - BookTypeException
		}
		catch(BookTypeException e)
		{
			System.out.println("\nBookType=Kids :"+e);
		}
	}
}
