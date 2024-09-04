package com.evergent.CoreJAVA.Oops;

public class MethodOverLoading {
	
	public void loginData() {
		System.out.println("LoginInfo");
	}
	
	public void loginData(String uname,String pass ) {
		System.out.println("User name :"+uname);
		System.out.println("Password :"+pass);
	}
	
	public void loginData(String uname,String pass,String capcha  ) {
		System.out.println("User name :"+uname);
		System.out.println("Password :"+pass);
	}
	
	public void Show() {
		System.out.println("Show Method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading  ol =new MethodOverLoading();
		ol.loginData();
		ol.loginData("Sita", "Sita@123");
		ol.loginData("Gita","Gita@321","xyz");
		ol.Show();

	}

}
