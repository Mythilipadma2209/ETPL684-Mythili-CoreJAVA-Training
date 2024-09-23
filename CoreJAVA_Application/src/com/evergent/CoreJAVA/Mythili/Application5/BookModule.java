package com.evergent.CoreJAVA.Mythili.Application5;
//Interface class representing BookModule
public interface BookModule {
	public void showBooks() throws InvalidBookSelectionException;
	public void selectBooks(String BookType) throws InvalidBookSelectionException;
	public void calculateTotal();
}
