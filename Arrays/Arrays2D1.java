package com.evergent.CoreJAVA.Arrays;

public class Arrays2D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= new int[5][5];
		for(int i=0;i<5;i++) {
			System.out.println();
			for (int j=0;j<5;j++) {
				a[i][j]=7;
				System.out.print(" "+a[i][j]);
			}
		}

	}

}
/*
7 7 7 7 7
7 7 7 7 7
7 7 7 7 7
7 7 7 7 7
7 7 7 7 7
*/