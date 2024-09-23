package com.evergent.CoreJAVA.Mythili.Application4;
// Main class
import java.io.IOException;
import java.util.Scanner;

public class StoreManagement extends ReservationModule implements BookModule{
	static int bookPrice;
    static int quantity;
    static int totalAmount;
    static int discountAmount;
    static int reservationCharges;
    private Customer customer;
    
    //Constructor accepting Customer object
    public StoreManagement(Customer customer) {
    	this.customer = customer;
        customer.inputCustomerDetails(); // Take customer details from the input
        System.out.println("Welcome, " + customer.getName() + " (Customer ID: " + customer.getCustomerId() + ")");
    }
    @Override
    public void showBooks() {
    	
    	System.out.println(" Book Module");
        System.out.println("=================");
        System.out.println("N-Novels");
        System.out.println("I-Inspiring Books");
        System.out.println("B-Business Books");
        System.out.println("M-Return to Main Menu");
        System.out.println("=================");
        System.out.print("Enter your Submodule code (N,I,B,M): ");
        Scanner sc=new Scanner(System.in);
        String module = sc.nextLine().toUpperCase();
        selectBooks(module);
    }
    @Override
	public void selectBooks(String BookType) {
    	Scanner sc=new Scanner(System.in);
    	switch(BookType){
    		case "N":
    			System.out.println("Menu \t Description \t\t\t\t  Price");
    			System.out.println("=======================================================");
    			System.out.println("A \t Take A Journey Of SelfLove \t\t Rs 30.00");
    			System.out.println("B \t The Girl With No Dreams \t\t Rs 40.00");
    			System.out.println("C \t Things We left Behind \t\t\t Rs 50.00");
    			System.out.println("D \t The Secret Garden \t\t\t Rs 45.00");
    			break;
    			
    		case "I":
                System.out.println("Menu \t Description \t\t\t Price");
                System.out.println("===============================================");
                System.out.println("A \t Wings Of Fire \t\t\t Rs 25.00");
                System.out.println("B \t You Can       \t\t\t Rs 35.00");
                System.out.println("C \t One Day Life Will Change \t Rs 45.00");
                System.out.println("d \t Good Vibes Good Life \t\t Rs 40.00");                
                break;
                
    		case "B":
    			System.out.println("Menu \t Description \t\t\t Price");
                System.out.println("===============================================");
                System.out.println("A \t Success Principles       \t Rs 50.00");
                System.out.println("B \t The Psychology Of Money  \t Rs 60.00");
                System.out.println("C \t Don't Sell Make Them Buy \t Rs 70.00");
                System.out.println("D \t Zero To One              \t Rs 65.00");
                break;
                
    		case "M":
    			return;
    			
    		default :
    			System.out.println("Invalid Code");
    			return;
    	}
    	System.out.print("Enter your Menu code (A,B,C,D): ");
    	String menuCode = sc.nextLine().toUpperCase();
    	switch(menuCode){
    		case "A":
    			bookPrice = BookType.equals("N") ? 30 : BookType.equals("I") ? 25 : 50;
    			break;
    		case "B":
    			bookPrice = BookType.equals("N") ? 40 : BookType.equals("I") ? 35 : 60;
    			break;
    		case "c":
    			bookPrice = BookType.equals("N") ? 50 : BookType.equals("I") ? 45 : 70;
    			break;
    		case "D":
    			bookPrice = BookType.equals("N") ? 45 : BookType.equals("I") ? 40 : 65;
    			break;
    		default:
    			System.out.println("Invalid menucode!");
    			return;
    	}
    	System.out.println("Enter the Quantity: ");
    	quantity=Integer.parseInt(sc.nextLine());
    	calculateTotal();
	}
    
    @Override
    public void calculateTotal() {
    	totalAmount = bookPrice * quantity;
    	if (quantity >= 1 && quantity <= 10) {
            discountAmount = (int) (totalAmount * 0.00);
        } else if (quantity >= 11 && quantity <= 20) {
            discountAmount = (int) (totalAmount * 0.05);
        } else if (quantity > 20) {
            discountAmount = (int) (totalAmount * 0.10);
        }
    	
    	   // Membership discount
        switch (customer.getMembershipType().toLowerCase()) {
            case "silver":
                discountAmount += (int) (totalAmount * 0.05);
                System.out.println("Silver membership discount applied: 5%");
                break;
            case "gold":
                discountAmount += (int) (totalAmount * 0.10);
                System.out.println("Gold membership discount applied: 10%");
                break;
            default:
                // Regular membership has no extra discount
                break;
        }

        totalAmount -= discountAmount;
        System.out.println("Amount after discount: Rs" + totalAmount);
    		
    }
    
    @Override
	void reserveBook() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println(" Reservation Module");
        System.out.println("=============================================");
        System.out.println("Menu \t Description \t\t\t Price");
        System.out.println("========================================");
        System.out.println("1 \t Reservation Per Day \t Rs 10.00");
        System.out.println("2 \t Reservation Per Week \t Rs 40.00");
        System.out.println("========================================");
        System.out.print("Enter your Submodule code (1, 2): ");
        int resCode = Integer.parseInt(sc.nextLine());
        switch (resCode) {
        	case 1:
        		reservationCharges = 10;
        		break;
        	case 2:
        		reservationCharges = 40;
        		break;
        }
        System.out.println("Your resevation cost : Rs"+reservationCharges);
        System.out.println("Resevation is Done");
	}
    
    public void donateBook(String bookTitle) {
    	DonateBook donation = new DonateBook();
        donation.donateBook(bookTitle);
    }
    
    public void downloadEBook(String title, int sizeInMB) {
        EBook ebook = new EBookImpl(title, sizeInMB);
        ebook.download();
    }
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\t\t\t\t Welcome To BOOKSTORE MANAGEMENT SYSTEM");
		// Creating and inputting customer details
        Customer customer = new CustomerImpl();
		StoreManagement bookstore = new StoreManagement(customer);
		PaymentModule payment = new PaymentModule();
		

        while (true) {
            System.out.println("=====================");
            System.out.println(" Bookstore Main Menu");
            System.out.println("=====================");
            System.out.println("B-Book Module");
            System.out.println("R-Reservation Module");
            System.out.println("P-Payment Module");
            System.out.println("D - Donate Book");
            System.out.println("E - Download EBook");
            System.out.println("Q-Quit Module");
            System.out.println("=====================");
            System.out.print("Enter your Module code (B,R,P,D,E,Q): ");
            String module = sc.nextLine().toUpperCase();
            switch (module) {
            	case "B":
            		bookstore.showBooks();
            		break;
            	case "R":
            		bookstore.showReservationCharges();
            		break;
            	case "P":
            		payment.displaytotalAmount(totalAmount,reservationCharges);
            		payment.paymentprocess();
            		break;
            	case "D":
                    System.out.print("Enter the title of the book you want to donate: ");
                    String bookTitle = sc.nextLine();
                    break;
            	 case "E":
                     System.out.print("Enter the title of the eBook: ");
                     String title = sc.nextLine();
                     System.out.print("Enter the size of the eBook in MB: ");
                     int sizeInMB = Integer.parseInt(sc.nextLine());
                     bookstore.downloadEBook(title, sizeInMB);
                     break;
            	case "Q":
            		System.out.println("Quitting the system...");
                    System.exit(0);
                    break;
            	 default:
                     System.out.println("Invalid Module code!");
                     break;
            }	
	
        }	
	}
}

