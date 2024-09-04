package com.evergent.CoreJAVA.Mythili.Application2;

import java.io.IOException;
import java.util.Scanner;

public class BookStoreManagement {
	 	enum Module {B, R, P, E}
	    enum Bookmodule1 {N, I, B, M}
	    enum Reservationmodule2 {R, B, M}
	    enum Paymentmodule3 {T, D, M}
	    enum MenuCode {A, B, C, D}
	    
	    static int bookPrice;
	    static int quantity;
	    static int totalAmount;
	    static int discountAmount;
	    static int resevationCharges;

	    public static void main(String[] args) throws IOException {
	        String module = null;
	        Scanner sc = new Scanner(System.in);

	        System.out.println("\n\t\t\t\t Welcome To BOOKSTORE MANAGEMENT SYSTEM");

	        while (true) {
	            System.out.println("=================");
	            System.out.println(" Bookstore Main Menu");
	            System.out.println("=================");
	            System.out.println("B-Book Module");
	            System.out.println("R-Reservation Module");
	            System.out.println("P-Payment Module");
	            System.out.println("E-Quit Module");
	            System.out.println("=================");
	            System.out.print("Enter your Module code (B,R,P,E): ");
	            module = sc.nextLine().toUpperCase();

	            switch (Module.valueOf(module)) {
	                case B:
	                    System.out.println(" Book Module");
	                    System.out.println("=================");
	                    System.out.println("N-Novels");
	                    System.out.println("I-Inspiring Books");
	                    System.out.println("B-Business Books");
	                    System.out.println("M-Return to Main Menu");
	                    System.out.println("=================");
	                    System.out.print("Enter your Submodule code (N,I,B,M): ");
	                    module = sc.nextLine().toUpperCase();

	                    switch (Bookmodule1.valueOf(module)) {
	                        case N:
	                            System.out.println("Menu \t Description \t\t\t\t  Price");
	                            System.out.println("=======================================================");
	                            System.out.println("A \t Take A Journey Of SelfLove \t\t Rs 30.00");
	                            System.out.println("B \t The Girl With No Dreams \t\t Rs 40.00");
	                            System.out.println("C \t Things We left Behind \t\t\t Rs 50.00");
	                            System.out.println("D \t The Secret Garden \t\t\t Rs 45.00");
	                            System.out.print("Enter your Menu code (A,B,C,D): ");
	                            module = sc.nextLine().toUpperCase();

	                            switch (MenuCode.valueOf(module)) {
	                                case A:
	                                    bookPrice = 30;
	                                    break;
	                                case B:
	                                    bookPrice = 40;
	                                    break;
	                                case C:
	                                    bookPrice = 50;
	                                    break;
	                                case D:
	                                    bookPrice = 45;
	                                    break;
	                            }

	                            System.out.print("Enter the quantity: ");
	                            quantity = Integer.parseInt(sc.nextLine());
	                            System.out.println("You selected quantity: " + quantity);
	                            totalAmount = bookPrice * quantity;
	                            System.out.println("Amount before discount: $" + totalAmount);

	                            if (quantity >= 1 && quantity <= 10) {
	                                discountAmount = (int) (totalAmount * 0.00);
	                            } else if (quantity >= 11 && quantity <= 20) {
	                                discountAmount = (int) (totalAmount * 0.05);
	                            } else if (quantity > 20) {
	                                discountAmount = (int) (totalAmount * 0.10);
	                            }

	                            totalAmount -= discountAmount;
	                            System.out.println("Amount after discount: Rs" + totalAmount);
	                            break;
	                        
	                        case I:
	                            System.out.println("Menu \t Description \t\t\t Price");
	                            System.out.println("===============================================");
	                            System.out.println("A \t Wings Of Fire \t\t\t Rs 25.00");
	                            System.out.println("B \t You Can       \t\t\t Rs 35.00");
	                            System.out.println("C \t One Day Life Will Change \t Rs 45.00");
	                            System.out.println("d \t Good Vibes Good Life \t\t Rs 40.00");
	                            
	                            System.out.print("Enter your Menu code (A,B,C,D): ");
	                            module = sc.nextLine().toUpperCase();

	                            switch (MenuCode.valueOf(module)) {
	                                case A:
	                                    bookPrice = 25;
	                                    break;
	                                case B:
	                                    bookPrice = 35;
	                                    break;
	                                case C:
	                                    bookPrice = 45;
	                                    break;
	                                case D:
	                                    bookPrice = 40;
	                                    break;
	                            }

	                            System.out.print("Enter the quantity: ");
	                            quantity = Integer.parseInt(sc.nextLine());
	                            System.out.println("You selected quantity: " + quantity);
	                            totalAmount = bookPrice * quantity;
	                            System.out.println("Amount before discount: $" + totalAmount);

	                            if (quantity >= 1 && quantity <= 10) {
	                                discountAmount = (int) (totalAmount * 0.00);
	                            } else if (quantity >= 11 && quantity <= 20) {
	                                discountAmount = (int) (totalAmount * 0.05);
	                            } else if (quantity > 20) {
	                                discountAmount = (int) (totalAmount * 0.10);
	                            }

	                            totalAmount -= discountAmount;
	                            System.out.println("Amount after discount: Rs" + totalAmount);
	                            break;

	                        case B:
	                            System.out.println("Menu \t Description \t\t\t Price");
	                            System.out.println("===============================================");
	                            System.out.println("A \t Success Principles       \t Rs 50.00");
	                            System.out.println("B \t The Psychology Of Money  \t Rs 60.00");
	                            System.out.println("C \t Don't Sell Make Them Buy \t Rs 70.00");
	                            System.out.println("D \t Zero To One              \t Rs 65.00");
	                            System.out.print("Enter your Menu code (A,B,C,D): ");
	                            module = sc.nextLine().toUpperCase();

	                            switch (MenuCode.valueOf(module)) {
	                                case A:
	                                    bookPrice = 50;
	                                    break;
	                                case B:
	                                    bookPrice = 60;
	                                    break;
	                                case C:
	                                    bookPrice = 70;
	                                    break;
	                                case D:
	                                    bookPrice = 65;	                                    
	                                    break;
	                            }

	                            System.out.print("Enter the quantity: ");
	                            quantity = Integer.parseInt(sc.nextLine());
	                            System.out.println("You selected quantity: " + quantity);
	                            totalAmount = bookPrice * quantity;
	                            System.out.println("Amount before discount: Rs" + totalAmount);

	                            if (quantity >= 1 && quantity <= 10) {
	                                discountAmount = (int) (totalAmount * 0.00);
	                            } else if (quantity >= 11 && quantity <= 20) {
	                                discountAmount = (int) (totalAmount * 0.05);
	                            } else if (quantity > 20) {
	                                discountAmount = (int) (totalAmount * 0.10);
	                            }

	                            totalAmount -= discountAmount;
	                            System.out.println("Amount after discount: Rs" + totalAmount);
	                            break;
	                            
	                        case M:
	                        	break;
	                        	
	                    }
	                    break;

	                case R:
	                    System.out.println(" Reservation Module");
	                    System.out.println("=================");
	                    System.out.println("R-Reserve a Book");
	                    System.out.println("M-Return to Main Menu");
	                    System.out.println("=================");
	                    System.out.print("Enter your Submodule code (R,M): ");
	                    module = sc.nextLine().toUpperCase();

	                    switch (Reservationmodule2.valueOf(module)) {
	                        case R :
	                        	System.out.println("Menu \t Description \t\t\t Price");
		                        System.out.println("========================================");
	                            System.out.println("1 \t Reservation Per Day \t Rs 10.00");
	                            System.out.println("2 \t Reservation Per Week \t Rs 40.00");
	                            System.out.println("========================================");
	                            System.out.print("Enter your Submodule code (1, 2): ");
	                            int resCode = Integer.parseInt(sc.nextLine());
	                            switch (resCode) {
	                            	case 1:
	                            		resevationCharges = 10;
	                            		break;
	                            	case 2:
	                            		resevationCharges = 40;
	                            		break;
	                            }
	                            System.out.println("Your resevation cost : Rs"+resevationCharges);
	                            System.out.println("Resevation is Done");
	                            break;
	                            
	                        case M:
	                        	break;
	                    }
	                    break;
	                    
	                case P:
	                    System.out.println(" Payment Module");
	                    System.out.println("=================");
	                    System.out.println("T-Display Total Amount");
	                    System.out.println("D-Do Payment");
	                    System.out.println("M-Return to Main Menu");
	                    System.out.println("=================");
	                    System.out.print("Enter your Submodule code (T,D,M): ");
	                    module = sc.nextLine().toUpperCase();

	                    switch (Paymentmodule3.valueOf(module)) {
	                        case T:
	                        	System.out.println("Total Amount of Book to be Paid: Rs" + totalAmount);
	                        	System.out.println("Book reservation to be Paid: Rs" + resevationCharges);
	                        	System.out.println("Total Amount to be Paid: Rs" + (totalAmount + resevationCharges));
	                            break;

	                        case D:
	                            
	                            System.out.println("Total Payment Amount: Rs" + (totalAmount + resevationCharges));
	                            System.out.println("Payment Processing ...");
	                            System.out.println("Payment is Done...");
	                            break;
	                            
	                        case M:
	                        	break;
	                    }
	                    break;

	                case E:
	                    System.out.println("Quitting the system...");
	                    System.exit(0);
	                    break;
	            }
	        }
	    }
	}

