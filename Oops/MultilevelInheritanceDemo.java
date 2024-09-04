package com.evergent.CoreJAVA.Oops;

class PersonData{
	public void mypersondata() {
		System.out.println("PersonData Class Method");
	}
}
class PersonInfo extends PersonData{
	public void Personinfo() {
		System.out.println("Personinfo Class Method");
	}
}
public class MultilevelInheritanceDemo extends PersonInfo {
	public void show() {
		System.out.println("Local method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelInheritanceDemo ml =new MultilevelInheritanceDemo();
		ml.mypersondata();
		ml.Personinfo();
		ml.show();
	}

}
