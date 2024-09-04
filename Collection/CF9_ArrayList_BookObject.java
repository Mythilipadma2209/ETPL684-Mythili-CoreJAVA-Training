package com.evergent.CoreJAVA.Collection;
import java.util.ArrayList;

class Book{
	String name;
	public Book(String name) {
		this.name=name;
	}
	public String toString() {
		return name;
	}
}
public class CF9_ArrayList_BookObject {
	public static void main(String[] Args) {
		Book b1 = new Book("Core JAVA");
		Book b2 = new Book("Let us C");
		Book b3 = new Book("Programming Index");
		
		ArrayList mylist = new ArrayList();
		mylist.add(b1);
		mylist.add(b2);
		mylist.add(b3);
		System.out.println(mylist);
		
	}
}
