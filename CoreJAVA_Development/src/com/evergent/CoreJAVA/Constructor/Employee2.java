package com.evergent.CoreJAVA.Constructor;

public class Employee2 {
	int eno; //0 123  step7
	String ename;//null raj
	double sal;// 0.0  51000	
	Employee2(){//step3
		System.out.println("Default Constructor");
	}	
	Employee2(int eno1,String ename1,double sal1){//step5
		eno=eno1; //step6
		ename=ename1;
		sal=sal1;		
	}	
	public void display() {//step 9
		System.out.println("Employee No :"+eno);
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee Salary :"+sal);
	}
	public static void main(String[] args) { //step1
		// TODO Auto-generated method stub
		new Employee2();//step2
		Employee2 em= new Employee2(123,"Raj",51000);//step4
		em.display();//step8
	}//step10
}//step11
