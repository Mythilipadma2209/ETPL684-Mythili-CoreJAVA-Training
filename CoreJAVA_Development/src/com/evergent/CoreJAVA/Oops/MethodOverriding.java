package com.evergent.CoreJAVA.Oops;
class Mydatainfo{
	public void myData() {
		System.out.println("Super Class Method");
	}
}
public class MethodOverriding extends Mydatainfo{
	public void myData() {
		System.out.println("Sub Class Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding or =new MethodOverriding();
		or.myData();
	}

}
