package com.evergent.CoreJAVA.Ram.Application3;
// class
public class BankRBI {
	
	static {
		System.out.println("Welcome to EmployeeDetails");
	}
	public BankRBI() {
		System.out.println("RBI bank Home Loan & Personal Loan Intrest");
	}
	public BankRBI(double p,double r) {
		System.out.println(p*r/100);
	}
	public static final void getBankDetails() {
		System.out.println(" Home Loan Intrest is 8.5%");
		System.out.println(" Personal Loan Intrest is 11%");
	}
}
