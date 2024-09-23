package com.evergent.CoreJAVA.Interfaces;
//1.Interface is a keyword.
//2.We can declare methods signatures only but not implementations.
//3.By default all interface methods are abstract.
//4.If any class implements interface that class should override all 
//  interface methods otherwise the class will be showing compile time error.
//6. We can declare variables inside the interface all are public static final.
public class BookImpl implements Book{
	
	public void bookTitle(){
		System.out.println("BookTitle is Core Java");
	}
	public void bookAuthor(){
		System.out.println("BookAuthor is Oracle crop : "+cName);
	}
	public void bookPrice(){
		System.out.println("BookPrice is Rs.550");	
	}
	public void show(){
		System.out.println("Local Method of BookIMPL");	
	}
	public static void main(String[] args) {
		BookImpl b1= new BookImpl();
		b1.bookTitle();
		b1.bookAuthor();
		b1.bookPrice();
		b1.show();
	}
}
