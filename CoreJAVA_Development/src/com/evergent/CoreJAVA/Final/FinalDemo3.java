package com.evergent.CoreJAVA.Final;
// final Class can not be extends(inheritance)
final class Myclass{
	final public void myProducts(){
		System.out.println("All Products");
	}
}
//FinalDemo2.java
public class FinalDemo3
{
	final String cname="India";
	final public void myProducts1(){
		System.out.println("All Products");
	}
	public void display() {
		System.out.println(cname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo3 f=new FinalDemo3();
		f.display();
		Myclass mc=new Myclass();
		mc.myProducts();
	}
}
