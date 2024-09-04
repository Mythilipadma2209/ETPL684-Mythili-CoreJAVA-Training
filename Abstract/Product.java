package com.evergent.CoreJAVA.Abstract;
//1.Abstract is a keyword.
//2. Abstract class having abstract methods and concrete(implemented) methods.
//3.If any class having one abstract method that class should be declare as
//  abstract keyword,otherwise the class will be showing compile time error.
abstract public class Product {
	String name = "Mobile";
	abstract public void NewProduct();
	public void AllProduct() {
		System.out.println("All Products");
	}
}
