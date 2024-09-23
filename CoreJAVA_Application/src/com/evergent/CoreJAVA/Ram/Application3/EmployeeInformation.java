package com.evergent.CoreJAVA.Ram.Application3;
//MainClass
public class EmployeeInformation extends BankAccountDetails implements EmployeeInterface{
	int eno;
	double sal;
	String address;
	//Interface override Methods
	public void EmployeeInfo(int eno,float sal) {
		this.eno=eno;
		this.sal=sal;
	}
	public void EmployeeAddress(String address) {
		this.address=address;
	}
	public void EmployeeDetails() {
		System.out.println("Employee No:"+eno);
		System.out.println("Employee Sal:"+sal);
		System.out.println("Employee Address:"+address);
	}
	//abstract class implementation
	public void accountDetails() {
		System.out.println("My account setails is : 12345678");
	}
	public void show() {
		System.out.println("This is show local methods");
	}
	public static void main(String[] args) {
		// Interface Methods calling
		EmployeeInformation emp=new EmployeeInformation();
		emp.EmployeeInfo(100,5000);
		emp.EmployeeAddress("Bangalore");
		emp.EmployeeDetails();
		//Abstract method class
		emp.accountDetails();
		emp.bankDetails();
		//call local Methods
		emp.show();
		//calling BankRBL with HAS-A 
		BankRBI rbi = new BankRBI();
		BankRBI rbi1=new BankRBI(3.3,3.3);
		BankRBI.getBankDetails();
	}
}
