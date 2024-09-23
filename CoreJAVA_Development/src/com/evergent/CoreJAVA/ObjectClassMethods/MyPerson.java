package com.evergent.CoreJAVA.ObjectClassMethods;
// ObjectClassMethods-toString() , hashCode()
class Person{
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "Name:"+name+" Age :"+age;
	}
}
public class MyPerson {

	public static void main(String[] args) {
		Person p1=new Person("Bhanu",30);
		System.out.println(p1);
		System.out.println(p1.hashCode());

	}

}
