package com.evergent.CoreJAVA.generalprograms;

public class NestedLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
/*
55555
4444
333
22
1
*/