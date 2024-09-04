package com.evergent.CoreJAVA.Task2;
//Bean
public class Book {
		private String isbn;
		private String bookName;
		private int  price;
		
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getBookName() {
			return bookName;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getPrice() {
			return price;
		}				
}
