package com.evergent.CoreJAVA.LogicalProgramming;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int a=0,b=1;
		int temp=0;
		for (int i=0;i<=n;i++) {
			temp=a+b;
			a=b;
			b=temp;
			System.out.println(temp);
		}
		
		
	}

}
