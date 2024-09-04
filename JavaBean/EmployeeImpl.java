package com.evergent.CoreJAVA.JavaBean;

public class EmployeeImpl {

	public static void main(String[] args) {
		// Initializing values to the java beans
		EmployeeBean emp = new EmployeeBean();
		emp.setEno(10);
		emp.setEname("Ravi");
		emp.setSal(51000);
		// Getting values From the java beans
		System.out.println("Employee No : "+emp.getEno());
		System.out.println("Employee Name : "+emp.getEname());
		System.out.println("Employee Salary : "+emp.getSal());
	}
}
