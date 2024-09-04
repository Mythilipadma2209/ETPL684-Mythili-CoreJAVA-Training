package com.evergent.CoreJAVA.strings.Immutable;

public class MainPerson {

	public static void main(String[] args) {
		PersonImmutable person=new PersonImmutable("Raju",30);
		System.out.println("Name :"+person.myName());
		System.out.println("Age: "+person.myAge());
	}	
}
