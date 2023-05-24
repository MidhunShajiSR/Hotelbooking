package com.hotelbookingapp.HotelBooking.entity;

import java.time.LocalDate;

public class RentCalculate {
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private int rent;
	
	
	
	
	
	public RentCalculate(LocalDate checkInDate, LocalDate checkOutDate, int rent) {
		super();
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.rent = rent;
	}
	public LocalDate getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}
	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	
	
	
	
}
