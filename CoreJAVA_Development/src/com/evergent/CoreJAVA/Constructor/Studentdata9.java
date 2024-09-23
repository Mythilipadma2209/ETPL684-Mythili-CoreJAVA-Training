package com.evergent.CoreJAVA.Constructor;

public class Studentdata9 {
	String name;
	int age;
	public Studentdata9(String name,int age){
		this.name=name;
		this.age=age;
	}
	public Studentdata9(Studentdata9 s) {
		this.name=s.name;
		this.age=s.age;
	}
	public void displaydetails () {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentdata9 std1 = new Studentdata9("Bhanu",20);
		Studentdata9 std2 =new Studentdata9(std1);
		std1.displaydetails();
		std2.displaydetails();
	}
}
