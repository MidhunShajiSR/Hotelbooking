package com.hotelbookingapp.HotelBooking.service;

import java.time.Duration;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbookingapp.HotelBooking.entity.RentCalculate;
import com.hotelbookingapp.HotelBooking.entity.RentCalculationRestuarant;
import com.hotelbookingapp.HotelBooking.entity.RestaurantBooking;
import com.hotelbookingapp.HotelBooking.entity.RestaurantDetails;
import com.hotelbookingapp.HotelBooking.entity.TableDetails;
import com.hotelbookingapp.HotelBooking.repository.RestaurantBookingRepository;

@Service
public class RestaurantBookingService {
	
	@Autowired
	RestaurantBookingRepository restaurantBookingRepository;
	
	@Autowired
	RestaurantService restaurantService;
	
	@Autowired
	TableDetailsService tableDetailsService;
	

	public List<RestaurantBooking> getAllRestaurantBooking() {
		
		return restaurantBookingRepository.findAll();
	}

	public RestaurantBooking createRestaurantBooking(RestaurantBooking restaurantBooking) {
	
		TableDetails tableDetails = tableDetailsService.getTableDetailsById(restaurantBooking.getTableDetailsId()).get();
		Duration duration = Duration.between(restaurantBooking.getCheckInTime(), restaurantBooking.getCheckOut());
		if(tableDetails.getTableStatus())
		{
		float totalAmount = tableDetails.getTableRent() * duration.toHours();
		System.out.println("Total Booking Amount  ="+ totalAmount);
		restaurantBooking.setTotalAmount((duration.toHours()>0)?(totalAmount<0)?totalAmount *(-1):totalAmount:tableDetails.getTableRent());
		
		tableDetails.setTableStatus(false);
		tableDetailsService.insertTableDetails(tableDetails);
		return restaurantBookingRepository.save(restaurantBooking);
		}
		else return null;
	}

	public Optional<RestaurantBooking> getRestaurantBookingById(Integer id) {
	
		return restaurantBookingRepository.findById(id);
	}

	public RestaurantBooking updateRestaurantBooking(RestaurantBooking restaurantBooking, Integer id) {
		
		
		
		return null;
	}
	
public TableDetails calculateTotalAmount(RentCalculationRestuarant rentCalculationRestuarant) {
		
		Duration duration = Duration.between(rentCalculationRestuarant.getCheckInTime(), rentCalculationRestuarant.getCheckOutTime());
		int totalAmount = (int) (rentCalculationRestuarant.getRent() * duration.toHours());
		System.out.println("Total Booking Amount  ="+ totalAmount);
		TableDetails tableDetails=new TableDetails();
		tableDetails.setTableRent((duration.toHours()>0)?(totalAmount<0)?totalAmount *(-1):totalAmount:rentCalculationRestuarant.getRent());	

		return tableDetails;
		 
	}


	
	
}
