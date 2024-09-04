package com.evergent.CoreJAVA.JavaBean;

public class ProductImpl {

	public static void main(String[] args) {
		// Initializing values to the java beans
		ProductBean pi = new ProductBean(10,"Laptop",85000);
		
		// Getting values From the java beans
		System.out.println("Employee No : "+pi.getPno());
		System.out.println("Employee Name : "+pi.getPname());
		System.out.println("Employee Salary : "+pi.getPrice());
	}
}
