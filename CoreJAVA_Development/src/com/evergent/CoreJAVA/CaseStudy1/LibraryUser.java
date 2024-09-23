package com.evergent.CoreJAVA.CaseStudy1;

public interface LibraryUser {
	void register_Acc(int age) throws AgeRestrictionException;
	void requestBook(String bookType) throws BookTypeException;
}
