package com.evergent.CoreJAVA.Abstract;
//4.If any class extends abstract class, that class should be 
//  override all abstract methods, otherwise   the class will 
//  be showing compile time error.

public class ProductImpl1 extends Product{
	public void NewProduct() {
		System.out.println("My new Product ");
	}

	public void show() {
		System.out.println("Local methods of ProductImpl");
	}
	public static void main(String[] args) {
		ProductImpl1 p1 =new ProductImpl1();
		p1.NewProduct();
		p1.AllProduct();
		p1.show();

	}

}
