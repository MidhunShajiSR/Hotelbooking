package com.hotelbookingapp.HotelBooking.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="restaurantdetails")
public class RestaurantDetails {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="food_id")
	private int foodId;
	@Column(name="food_name")
	private String foodType;
	private String price;
	
	public RestaurantDetails() {
		
	}
	public RestaurantDetails(int foodId, String foodType, String price) {
		
		this.foodId = foodId;
		this.foodType = foodType;
		this.price = price;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	

}
