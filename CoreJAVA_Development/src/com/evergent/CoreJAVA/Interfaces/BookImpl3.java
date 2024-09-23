package com.evergent.CoreJAVA.Interfaces;
//  Java will support inheritance through interface.
//  One class can implements more than one interface.
public class BookImpl3 implements Book,NewBook{
	
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
	public void myNewBook(){
		System.out.println("My New Book Method");	
	}
	public void dataInfo() {
		System.out.println("Ny New DataInfo");
	}
	public static void main(String[] args) {
		BookImpl3 b3= new BookImpl3();
		b3.bookTitle();
		b3.bookAuthor();
		b3.bookPrice();
		b3.myNewBook();
		b3.show();
		b3.dataInfo();
		
	}
}
