package com.evergent.CoreJAVA.generalprograms;

public class BiggestOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=150,d=3,e=16;
		if(a >= b && a >= c && a >= d && a >= e)
			System.out.println("A is Largest");
		else if(b >= a && b >= c && b >= d && b >= e)
			System.out.println("B is Largest");
		else if(c >= a && c >= b && c >= d && c >= e)
			System.out.println("C is Largest");
		else if(d >= a && d >= b && d >= c && d >= e)
			System.out.println("D is Largest");
		else 
			System.out.println("E is Largest");
		

	}

}
