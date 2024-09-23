package com.evergent.CoreJAVA.Constructor;
class Myemployee{
	int eno;
	Myemployee(){
	}
	public Myemployee(int eno) {
		System.out.println("Employee No: "+eno);
	}
}
public class Employee6 extends Myemployee{
	String ename;//null raj
	double sal;// 0.0  51000	
	Employee6(){//step3
		System.out.println("Default Constructor");
	}	
	Employee6(int eno,String ename,double sal){//step5
		super(eno);
		this .ename=ename;
		this.sal=sal;
	}
	public void display() {//step 9
		//System.out.println("Employee No :"+eno);
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee Salary :"+sal);
	}
	public static void main(String[] args) { //step1
		// TODO Auto-generated method stub
		new Employee6();//step2
		Employee6 em= new Employee6(123,"Raj",51000);//step4
		em.display();//step8	
	}//step10
}//step11
