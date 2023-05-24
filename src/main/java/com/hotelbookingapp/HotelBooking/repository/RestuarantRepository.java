package com.hotelbookingapp.HotelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelbookingapp.HotelBooking.entity.RestaurantDetails;

public interface RestuarantRepository extends JpaRepository<RestaurantDetails, Integer> {

}
