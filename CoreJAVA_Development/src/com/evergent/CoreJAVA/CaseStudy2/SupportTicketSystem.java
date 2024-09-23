package com.evergent.CoreJAVA.CaseStudy2;
import java.util.ArrayDeque;
import java.util.Deque;
public class SupportTicketSystem {
	Deque<String> ticketQueue;
	public SupportTicketSystem() {
		ticketQueue=new ArrayDeque<>();
	}
	public void addTicket(String ticket) {
		ticketQueue.add(ticket);
		System.out.println("Added ticket:" +ticket);
	}
	public void processNextTicket() {
		String ticket= ticketQueue.poll();
		if(ticket!= null) {
			System.out.println("Processing ticket: "+ticket);
		}
		else {
			System.out.println("No ticket to process");
		}
	}
	public String peekNextTicket() {
		String ticket = ticketQueue.peek();
		if(ticket!= null) {
			System.out.println("Next ticket to process: "+ticket);
		}
		return "No tickets to process";
	}
	public void displayQueue() {
			System.out.println("Current tickets in the queue: "+ticketQueue);
	}
	public static void main(String[] args) {
		SupportTicketSystem sys=new SupportTicketSystem();
		sys.addTicket("1. Issue with login");
		sys.addTicket("2. reset password");
		sys.addTicket("3. Payment issue");
		sys.displayQueue(); //display the queue
		sys.processNextTicket();//ticket process
		sys.processNextTicket();
		sys.processNextTicket();
		sys.processNextTicket();//ticket process to an empty queue
		System.out.println("Next ticket : " + sys.peekNextTicket());
		sys.displayQueue();//again displaying the queue
	}

}
