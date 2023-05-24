package com.hotelbookingapp.HotelBooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelbookingapp.HotelBooking.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
