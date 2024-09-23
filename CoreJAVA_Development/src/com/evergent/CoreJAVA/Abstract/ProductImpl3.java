package com.evergent.CoreJAVA.Abstract;
////5. We cannot create object to abstract class but we can create 
//     reference to abstract class.
public class ProductImpl3 extends Product3{
	public void NewProduct() {
		//name="Welcome";
		System.out.println("My new Product :"+name);
	}
	public ProductImpl3() {
		System.out.println(" ProductImpl3 : constructor");
	}

	public void show() {
		System.out.println("Local methods of ProductImp3");
	}
	public static void main(String[] args) {
		
		Product3 p2 =new ProductImpl3();
		p2.NewProduct();
		p2.AllProduct();
		//p2.show();
		//The method show() is undefined for the type Product

	}

}
