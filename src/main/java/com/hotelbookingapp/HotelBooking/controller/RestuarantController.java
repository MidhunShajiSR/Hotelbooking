package com.hotelbookingapp.HotelBooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotelbookingapp.HotelBooking.entity.RestaurantDetails;
import com.hotelbookingapp.HotelBooking.entity.RoomDetails;
import com.hotelbookingapp.HotelBooking.service.RestaurantService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("hotelbooking")
public class RestuarantController {
	
	@Autowired
	private RestaurantService restuarantService;
	
	@GetMapping("/Foods")
	public List <RestaurantDetails> getAllFoods(){
		return restuarantService.getAllFoods();
		
	}
	
	@PostMapping("/insertFoods")
	public RestaurantDetails insertFood(@RequestBody RestaurantDetails restaurantDetails) {
		return restuarantService.insertFood(restaurantDetails);
		
	}
	@GetMapping("/getFoodsById/{id}")
	public Optional<RestaurantDetails> getFoodById(@PathVariable("id") Integer id) {
		return restuarantService.getFoodById(id);
		
	}
	
	@PutMapping("/updateFood/{id}")
	
	public RestaurantDetails updateFood(@RequestBody RestaurantDetails restaurantDetails, @PathVariable("id") Integer id) {
		return restuarantService.updateFood(restaurantDetails, id);
		
	}
	
	@DeleteMapping("/deleteFood/{id}")
	public String deleteManager(@PathVariable("id") Integer id) {
	return restuarantService.deleteManager(id);
	}
	@GetMapping("/filterFood")
	public List<RestaurantDetails> filterFood(@RequestBody RestaurantDetails restuarantDetails){
		return restuarantService.filterFood(restuarantDetails);
	}
}
