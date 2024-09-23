package com.evergent.CoreJAVA.Mythili.Application4;
//Class representing Payment Module 
public class PaymentModule {
	private static int totalAmount;
	static void displaytotalAmount(int BookAmount,int ReservationCharges){
		totalAmount = BookAmount+ReservationCharges;
		System.out.println("Total Amount to be paid :	Rs"+totalAmount);
	}
	public final void paymentprocess(){
		System.out.println("Payment of Rs "+totalAmount+" is Processing....");
		System.out.println("your Payment is Done.");
	}
	
}
