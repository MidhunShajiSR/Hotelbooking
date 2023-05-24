package com.hotelbookingapp.HotelBooking.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Converter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurant_booking")
public class RestaurantBooking {
	
	@Id
	@Column(name = "booking_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int restaurantBookingId;
	@JoinColumn(name="customer_id")
	@Column(name="customer_id")
	private int customerId;	
	@JoinColumn(name = "table_details_id")
	@Column(name = "table_details_id")
	private int tableDetailsId;
	@Column(name="booking_date")
	private LocalDate bookingDate;
	@Column(name = "check_in")
	private LocalTime checkInTime;
	@Column(name = "check_out")
	private LocalTime checkOut;
	@Column(name = "total_amount")
	private float totalAmount;
	
	
	public RestaurantBooking() {
		super();
	}
	public RestaurantBooking(int restaurantBookingId, int customerId, int tableDetailsId,
			LocalDate bookingDate, LocalTime checkInTime, LocalTime checkOut, float totalAmount) {
		super();
		this.restaurantBookingId = restaurantBookingId;
		this.customerId = customerId;
		this.tableDetailsId = tableDetailsId;
		this.bookingDate = bookingDate;
		this.checkInTime = checkInTime;
		this.checkOut = checkOut;
		this.totalAmount = totalAmount;
	}
	public int getRestaurantBookingId() {
		return restaurantBookingId;
	}
	public void setRestaurantBookingId(int restaurantBookingId) {
		this.restaurantBookingId = restaurantBookingId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getTableDetailsId() {
		return tableDetailsId;
	}
	public void setTableDetailsId(int tableDetailsId) {
		this.tableDetailsId = tableDetailsId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public LocalTime getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(LocalTime checkInTime) {
		this.checkInTime = checkInTime;
	}
	public LocalTime getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(LocalTime checkOut) {
		this.checkOut = checkOut;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	
	
	
	
	

}
