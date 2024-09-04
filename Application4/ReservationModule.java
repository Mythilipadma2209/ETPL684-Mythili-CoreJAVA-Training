package com.evergent.CoreJAVA.Mythili.Application4;
//Abstract class representing ReservationModule
abstract public class ReservationModule {
	protected int reservationDuration;
	abstract void reserveBook();
	public void showReservationCharges() {
		System.out.println("Reservation charges will be applied as per the duration");
	}
	
}
