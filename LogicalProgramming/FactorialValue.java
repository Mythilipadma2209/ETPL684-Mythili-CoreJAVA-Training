package com.evergent.CoreJAVA.LogicalProgramming;

public class FactorialValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int fact=1;
		for (int i = 1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of 5 :" +fact);
	}

}
