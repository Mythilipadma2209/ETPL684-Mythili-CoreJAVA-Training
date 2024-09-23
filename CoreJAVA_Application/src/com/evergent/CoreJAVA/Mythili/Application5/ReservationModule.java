package com.evergent.CoreJAVA.Mythili.Application5;
//Abstract class representing ReservationModule
abstract public class ReservationModule {
	protected int reservationDuration;
	abstract void reserveBook() throws InvalidReservationException;
	public void showReservationCharges() {
		System.out.println("Reservation charges will be applied as per the duration");
	}
	
}
