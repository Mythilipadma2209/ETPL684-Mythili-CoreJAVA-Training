package com.evergent.CoreJAVA.Mythili.Application5;
//Implementation of  Customer Interface
import java.util.Scanner;
public class CustomerImpl implements Customer {
	 private String name;
	    private int customerId;
	    private String membershipType; 

	    @Override
	    public void inputCustomerDetails() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Customer Name: ");
	        name = sc.nextLine();

	        System.out.print("Enter Customer ID: ");
	        customerId = Integer.parseInt(sc.nextLine());

	        System.out.print("Enter Membership Type (Regular, Silver, Gold): ");
	        membershipType = sc.nextLine();
	    }

	    @Override
	    public String getName() {
	        return name;
	    }

	    @Override
	    public int getCustomerId() {
	        return customerId;
	    }

	    @Override
	    public String getMembershipType() {
	        return membershipType;
	    }
}
