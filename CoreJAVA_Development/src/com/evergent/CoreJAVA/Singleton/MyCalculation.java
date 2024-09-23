package com.evergent.CoreJAVA.Singleton;

class Calculation {
	int a=100,b=5,c;
	public void addition() {
		c=a+b;
		System.out.println("Addition :"+c);
	}
	public void sub() {
		c=a-b;
		System.out.println("Sub :"+c);
	}
}
public class MyCalculation extends Calculation {

	public static void main(String[] args) {
		MyCalculation mc = new MyCalculation();
		mc.addition();
		mc.sub();
		
		Calculation cal = new Calculation();
		cal.addition();
		System.out.println("cal : memory location for hashcode :"+cal.hashCode());
		System.out.println("mc : memory location for hashcode :"+mc.hashCode());
		
		MyCalculation mc1 = new MyCalculation();
		System.out.println("mc1 : memory location for hashcode :"+mc1.hashCode());		
	}
}
