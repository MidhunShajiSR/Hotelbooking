package com.hotelbookingapp.HotelBooking.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="room_service")
public class RoomServiceDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idroom_service")
	private int serviceRestaurantId;
	@JoinColumn(name="room_id")
	@Column(name="room_id")
	private int roomId;
	@JoinColumn(name="customer_id")
	@Column(name="customer_details_id")
	private int customerId;
	@Column(name="check_in_Date")
	private LocalDate checkInDate; 
	@Column(name="check_out_date")
	private LocalDate checkOutDate;
	@Column(name="total_rent")
	private int totalRent;
	
	public RoomServiceDetails() {
		super();
	}
	public RoomServiceDetails(int serviceRestaurantId, int roomId, int customerId, LocalDate checkInDate,
			LocalDate checkOutDate, int totalRent) {
		super();
		this.serviceRestaurantId = serviceRestaurantId;
		this.roomId = roomId;
		this.customerId = customerId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.totalRent = totalRent;
	}
	public int getServiceRestaurantId() {
		return serviceRestaurantId;
	}
	public void setServiceRestaurantId(int serviceRestaurantId) {
		this.serviceRestaurantId = serviceRestaurantId;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	public int getTotalRent() {
		return totalRent;
	}
	public void setTotalRent(int totalRent) {
		this.totalRent = totalRent;
	}
	
	
	

}