package com.evergent.CoreJAVA.generalprograms;

public class NestedLoop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=25;
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(count+" ");
				count=count-1;
			}
			System.out.println("");
		}
	}

}
