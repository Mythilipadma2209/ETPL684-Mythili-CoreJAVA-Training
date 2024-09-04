package com.evergent.CoreJAVA.Constructor;

class car{
	String color;
	int maxspeed;
	car(){
		color="white";
		maxspeed=120;
	}
	car(String color,int maxspeed){
		this.color=color;
		this.maxspeed=maxspeed;
	}
	void display() {
		System.out.println("color:"+color);
		System.out.println("maxspeed:"+maxspeed);
		
	}
}
public class Mycar7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car car1=new car();
		car car2=new car("Red",150);
		car1.display();
		car2.display();

	}

}
