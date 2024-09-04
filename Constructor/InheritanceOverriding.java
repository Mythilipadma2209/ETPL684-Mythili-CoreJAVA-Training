package com.evergent.CoreJAVA.Constructor;
// Other programs - Inheritance,Overriding,this,super,constructor
class animal{
	private String name;
	private int age;
	public animal(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void displayInfo(){
		System.out.println("Name :"+name);
		System.out.println("age :"+age);
	}
}
class Dog extends animal{
	private String breed;
	public Dog(String name,int age,String breed) {
		super(name,age);
		this.breed=breed;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Breed :"+breed);
	}
}
public class InheritanceOverriding {

	public static void main(String[] args) {
		Dog d=new Dog("Buddy",5,"Golden Retrevier");
		d.displayInfo();
	}
}
