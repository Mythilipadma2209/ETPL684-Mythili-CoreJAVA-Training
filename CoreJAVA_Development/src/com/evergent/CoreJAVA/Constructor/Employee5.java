package com.evergent.CoreJAVA.Constructor;

public class Employee5 {
	int eno; //0 123  step7
	String ename;//null raj
	double sal;// 0.0  51000	
	Employee5(){//step3
		System.out.println("Default Constructor");
	}	
	Employee5(int eno){
		this.eno=eno;
	}
	Employee5(int eno,String ename,double sal){//step5
		this(eno); //step6
		this .ename=ename;
		this.sal=sal;
	}
	public void display() {//step 9
		System.out.println("Employee No :"+eno);
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee Salary :"+sal);
	}
	public static void main(String[] args) { //step1
		// TODO Auto-generated method stub
		new Employee5();//step2
		Employee5 em= new Employee5(123,"Raj",51000);//step4
		em.display();//step8	
	}//step10

}//step11
