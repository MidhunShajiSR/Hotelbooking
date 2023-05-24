package com.hotelbookingapp.HotelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelbookingapp.HotelBooking.entity.Manager;
import com.hotelbookingapp.HotelBooking.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
