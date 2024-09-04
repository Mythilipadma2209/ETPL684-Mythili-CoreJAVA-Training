package com.evergent.CoreJAVA.multithreading;
class myclass extends Thread{
	public void run() {
		for (int i=1;i<=100;i++) {
			System.out.println(i);
		}
	}
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		myclass my = new myclass();
		my.setPriority(5);
		my.start();
		myclass my1 = new myclass();
		my1.setPriority(4);
		my1.start();
	}
}
