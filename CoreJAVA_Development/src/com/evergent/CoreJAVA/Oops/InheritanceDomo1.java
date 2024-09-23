package com.evergent.CoreJAVA.Oops;

public class InheritanceDomo1  extends Calculations{
	public void Show() {
		System.out.println("Show Method Local Class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceDomo1 id = new InheritanceDomo1();
		id.Show();
		id.Addition();
	}

}
