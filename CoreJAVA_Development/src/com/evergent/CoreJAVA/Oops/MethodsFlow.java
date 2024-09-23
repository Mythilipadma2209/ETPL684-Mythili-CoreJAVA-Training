package com.evergent.CoreJAVA.Oops;

public class MethodsFlow {
	public  void display() //No Arguments with No ReturnType
	{
		System.out.println("No Arguments with No ReturnType");
	}
	public  void Add(int a,int b) //Arguments with No ReturnType
	{
		System.out.println("Addition :"+(a+b));
	}
	public  int MyData(int a,int b) // Arguments with ReturnType
	{
		return a*b;
	}
	public  int show() //No Arguments with ReturnType
	{
		return 100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsFlow mf = new MethodsFlow();
		mf.display();
		mf.Add(2,3);
		int t= mf.MyData(2,3);
		System.out.println("Multiplication :"+t);
		int k=mf.show();
		System.out.println("Return value :"+k);
		
		
		
	}

}
