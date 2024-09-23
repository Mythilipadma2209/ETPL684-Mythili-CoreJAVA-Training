package com.evergent.CoreJAVA.WrapperClass;

public class WrapperClassDemo2 {
	public static void main(String[] args) {
		// float 
		float f1=10;
		Float f2 = new Float(f1);
		float f3=f2.floatValue();
		// double
		double d1=10;
		Double d2 = new Double(d1);
		double d3=d2.doubleValue();
		// byte
		byte b1=10;
		Byte b2 = new Byte(b1);
		byte b3=b2.byteValue();
		
		//float value
		System.out.println("float value"+f1);
		System.out.println("float object value :"+f2);
		System.out.println("convert float object value to primitive :"+f3);
		//double 
		System.out.println("double value"+d1);
		System.out.println("double object value :"+d2);
		System.out.println("convert double object value to primitive :"+d3);
		//byte 
		System.out.println("byte value"+b1);
		System.out.println("byte object value :"+b2);
		System.out.println("convert byte object value to primitive :"+b3);
	}
}
