package com.hotelbookingapp.HotelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelbookingapp.HotelBooking.entity.RoomDetails;

public interface RoomRepository extends JpaRepository<RoomDetails, Integer> {

}
