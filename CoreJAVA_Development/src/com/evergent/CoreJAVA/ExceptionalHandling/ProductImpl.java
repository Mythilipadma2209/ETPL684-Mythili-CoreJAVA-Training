package com.evergent.CoreJAVA.ExceptionalHandling;

class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message)
	{
		System.out.println("Hello :"+message);
	}
}
public class ProductImpl {
	int pno=105;
	public void myData() throws ProductNotFoundException
	{
		if (pno > 100)
			throw new ProductNotFoundException("there is No Productr");
		else
			System.out.println("Product are there");
	}

	public static void main(String[] args) {
		try {
			ProductImpl pi = new ProductImpl();
			pi.myData();
		}
		catch(ProductNotFoundException e){
			System.out.println(e);
		}

	}

}
