package com.evergent.CoreJAVA.Oops;

public class Person {
	String name="Mythili";
	int age=20;
	String address="Sangareddy";
	public void display() {
		System.out.println("Person Name : "+name);
		System.out.println("Person Age : "+age);
		System.out.println("Person Address : "+address);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.display();

	}

}
