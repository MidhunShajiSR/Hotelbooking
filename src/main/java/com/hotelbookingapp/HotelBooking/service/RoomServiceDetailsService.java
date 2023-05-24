package com.hotelbookingapp.HotelBooking.service;

import java.time.Period;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbookingapp.HotelBooking.entity.RentCalculate;
import com.hotelbookingapp.HotelBooking.entity.RoomDetails;
import com.hotelbookingapp.HotelBooking.entity.RoomServiceDetails;
import com.hotelbookingapp.HotelBooking.repository.RoomServiceDetailsRepository;

@Service
public class RoomServiceDetailsService {
	
	@Autowired
	RoomServiceDetailsRepository roomServiceDetailsRepository;
	
	@Autowired
	RoomService roomService;
	
	@Autowired
	CustomerService customerService;
	

	public List<RoomServiceDetails> getAllRoomServiceDetails() {
		
		return roomServiceDetailsRepository.findAll();
	}

	public RoomServiceDetails roomBooking(RoomServiceDetails roomServiceDetails) {
		
//		System.out.println("RoomDetails"+roomServiceDetails.getCustomerId());
//		System.out.println("RoomDetails"+roomServiceDetails.getCheckInDate());
		return roomServiceDetailsRepository.save(roomServiceDetails);
	}

	public Optional<RoomServiceDetails> getRoomServiceById(Integer id) {
		
		return roomServiceDetailsRepository.findById(id);
	}

	public RoomDetails updateRoomServiceDetails(RoomServiceDetails roomServiceDetails, Integer id) {
		
		return null;
	}

	public float calculateRent(RentCalculate rentCalculate) {
		
		
		Period period = Period.between(rentCalculate.getCheckInDate(),rentCalculate.getCheckOutDate());
		return rentCalculate.getRent() * period.getDays();
//		System.out.println("Total Rent ="+roomDetails.getRent()+" * "+period.getDays()+" = "+rent);
//		roomServiceDetails.setTotalRent((period.getDays()==0)?roomDetails.getRent():rent);
//
//		return 0;
	}
	
	
	
	

}