package com.hotelbookingapp.HotelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelbookingapp.HotelBooking.entity.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Integer> {

}
