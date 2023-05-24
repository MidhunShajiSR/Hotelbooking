package com.hotelbookingapp.HotelBooking.entity;

import java.time.LocalTime;

public class RentCalculationRestuarant {
	
	 private LocalTime checkInTime;
	 private LocalTime checkOutTime;
	 private int rent;
	 
	public RentCalculationRestuarant() {
		super();
	}
	public RentCalculationRestuarant(LocalTime checkInTime, LocalTime checkOutTime, int rent) {
		super();
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.rent = rent;
	}
	public LocalTime getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(LocalTime checkInTime) {
		this.checkInTime = checkInTime;
	}
	public LocalTime getCheckOutTime() {
		return checkOutTime;
	}
	public void setCheckOutTime(LocalTime checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	 
	 

}