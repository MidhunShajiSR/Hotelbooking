package com.hotelbookingapp.HotelBooking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="roomdetails")
public class RoomDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="room_id")
	private int roomId;
	@Column(name="room_category")
	private String roomCategory;
	@Column(name="room_type")
	private String roomType;
	private  int rent;
	@Column(name="paymentmode")
	private String paymentMode;
	private boolean status;
	
	
	public RoomDetails() {
		
	}
	public RoomDetails(int roomId, String roomCategory, String roomType, int rent, String paymentMode,boolean status) {
		
		this.roomId = roomId;
		this.roomCategory = roomCategory;
		this.roomType = roomType;
		this.rent = rent;
		this.paymentMode = paymentMode;
		this.status = status;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getRoomCategory() {
		return roomCategory;
	}
	public void setRoomCategory(String roomCategory) {
		this.roomCategory = roomCategory;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	
	
	
}
