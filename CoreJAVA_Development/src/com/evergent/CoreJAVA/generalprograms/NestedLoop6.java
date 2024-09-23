package com.evergent.CoreJAVA.generalprograms;

public class NestedLoop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for (int i=1;i<=n;i++) {
			System.out.println();
			for (int j=1;j<=i;j++) {
				System.out.print(" " +i);
			}
		}
		System.out.println();
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+i);
			}
			System.out.println();
		}

	}

}
/*
1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5
 4 4 4 4
 3 3 3
 2 2
 1
 */
