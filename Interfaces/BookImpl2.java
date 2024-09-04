package com.evergent.CoreJAVA.Interfaces;
//We cannot create objects to interface,
//but we can create references to interface.
public class BookImpl2 implements Book{
	
	public void bookTitle(){
		System.out.println("BookTitle is Core Java");
	}
	public void bookAuthor(){
		System.out.println("BookAuthor is Oracle crop"+cName);
	}
	public void bookPrice(){
		System.out.println("BookPrice is Rs.550");	
	}
	public void show(){
		System.out.println("Local Method of BookIMPL");	
	}
	public static void main(String[] args) {
		Book b2= new BookImpl2();
		b2.bookTitle();
		b2.bookAuthor();
		b2.bookPrice();
	}
}
