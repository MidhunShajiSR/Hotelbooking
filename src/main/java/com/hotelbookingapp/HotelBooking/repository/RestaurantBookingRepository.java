package com.hotelbookingapp.HotelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelbookingapp.HotelBooking.entity.RestaurantBooking;

public interface RestaurantBookingRepository extends JpaRepository<RestaurantBooking, Integer>{

}
