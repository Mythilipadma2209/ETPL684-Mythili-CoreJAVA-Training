package com.evergent.CoreJAVA.Abstract;
////5. We cannot create object to abstract class but we can create 
//     reference to abstract class.
public class ProductImpl2 extends Product{
	public void NewProduct() {
		//name="Welcome";
		System.out.println("My new Product :"+name);
	}

	public void show() {
		System.out.println("Local methods of ProductImpl");
	}
	public static void main(String[] args) {
		
		Product p2 =new ProductImpl2();
		p2.NewProduct();
		p2.AllProduct();
		//p2.show();
		//The method show() is undefined for the type Product

	}

}
