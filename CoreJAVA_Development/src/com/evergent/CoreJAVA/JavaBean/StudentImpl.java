package com.evergent.CoreJAVA.JavaBean;

public class StudentImpl {

	public static void main(String[] args) {
		// Initializing values to the java beans
		StudentBean stu = new StudentBean();
		stu.setSno(10);
		stu.setSname("Ramesh");
		stu.setAddress("Hyderabad");
		// Getting values From the java beans
		System.out.println(stu);
	}
}
