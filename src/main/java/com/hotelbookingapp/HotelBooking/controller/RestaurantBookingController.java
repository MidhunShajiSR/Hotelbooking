package com.hotelbookingapp.HotelBooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelbookingapp.HotelBooking.entity.RentCalculationRestuarant;
import com.hotelbookingapp.HotelBooking.entity.RestaurantBooking;
import com.hotelbookingapp.HotelBooking.entity.RoomDetails;
import com.hotelbookingapp.HotelBooking.entity.RoomServiceDetails;
import com.hotelbookingapp.HotelBooking.entity.TableDetails;
import com.hotelbookingapp.HotelBooking.service.RestaurantBookingService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("hotelbooking")
public class RestaurantBookingController {
	
	@Autowired
	RestaurantBookingService restaurantBookingService;

	
	@GetMapping("/restaurantBookingDetails")
	public List <RestaurantBooking> getAllRestaurantBooking(){
		
		return restaurantBookingService.getAllRestaurantBooking();
		
	}
	
	@PostMapping("/createRestaurantBooking")
	public RestaurantBooking insertRestaurantBooking(@RequestBody RestaurantBooking restaurantBooking) {
		return restaurantBookingService.createRestaurantBooking(restaurantBooking);
		
	}
	@GetMapping("/restaurantBookingById/{id}")
	public Optional<RestaurantBooking> getRestaurantBookingById(@PathVariable("id") Integer id) {
		return restaurantBookingService.getRestaurantBookingById(id);
		
	}
	
	@PutMapping("/updateRestaurantBooking/{id}")
	
	public RestaurantBooking updateRestaurantBooking(@RequestBody RestaurantBooking restaurantBooking, @PathVariable("id") Integer id) {
		return restaurantBookingService.updateRestaurantBooking(restaurantBooking, id);
		
	
		
}
	@PostMapping("/totalamount")
	public TableDetails calculateTotalAmount(@RequestBody RentCalculationRestuarant rentCalculationRestuarant) {
	
		return restaurantBookingService.calculateTotalAmount(rentCalculationRestuarant);
}
}
