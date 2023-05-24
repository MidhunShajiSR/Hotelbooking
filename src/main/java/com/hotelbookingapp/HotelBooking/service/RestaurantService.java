package com.hotelbookingapp.HotelBooking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbookingapp.HotelBooking.entity.Manager;
import com.hotelbookingapp.HotelBooking.entity.RestaurantDetails;
import com.hotelbookingapp.HotelBooking.repository.RestuarantRepository;

@Service
public class RestaurantService {
	@Autowired
	RestuarantRepository restuarantRepository;
	public List<RestaurantDetails> getAllFoods() {
		
		return restuarantRepository.findAll();
	}

	public RestaurantDetails insertFood(RestaurantDetails restaurantDetails) {
		
		return restuarantRepository.save(restaurantDetails);
	}

	public Optional<RestaurantDetails> getFoodById(Integer id) {
		
		return restuarantRepository.findById(id);
	}

	public RestaurantDetails updateFood(RestaurantDetails restaurantDetails, Integer id) {
		
		RestaurantDetails foodDetails = getFoodById(id).get();

		foodDetails.setFoodType((restaurantDetails.getFoodType()==null)?foodDetails.getFoodType():restaurantDetails.getFoodType());
		foodDetails.setPrice((restaurantDetails.getPrice()==null)?foodDetails.getPrice():restaurantDetails.getPrice());
		return restuarantRepository.save(foodDetails);
	}

	public String deleteManager(Integer id) {
	restuarantRepository.deleteById(id);
		return "Deleted Successfully";
	}

	public List<RestaurantDetails> filterFood(RestaurantDetails restuarantDetails) {

		List<RestaurantDetails> filterRestaurantDetails = new ArrayList<RestaurantDetails>();
		List<RestaurantDetails> filteredRestaurantDetails = new ArrayList<RestaurantDetails>();
		System.out.println("restuarantDetails"+restuarantDetails.getFoodType());
		List<RestaurantDetails>restuarantDetailsList = getAllFoods();
		
		if(!(restuarantDetails.getFoodType().isEmpty())) {
			System.out.println("Condition Name");

			for(RestaurantDetails restuarantDetailsTemp :restuarantDetailsList) {
				if(restuarantDetails.getFoodType().equals(restuarantDetailsTemp.getFoodType())) {
					System.out.println("Condition Name");
					filteredRestaurantDetails.add(restuarantDetailsTemp);
					
				}
				
			}
			filterRestaurantDetails.clear();
			filterRestaurantDetails.addAll(filteredRestaurantDetails);
			filteredRestaurantDetails.clear();
			if(filterRestaurantDetails.isEmpty()) { return filterRestaurantDetails;}
		}

		if(!(restuarantDetails.getPrice().isEmpty())){
				System.out.println("Condition Address");
				
			for(RestaurantDetails restuarantDetailsTemp : (filteredRestaurantDetails.isEmpty())?restuarantDetailsList:filteredRestaurantDetails) {	
				if(restuarantDetails.getPrice().equals(restuarantDetailsTemp.getPrice())) {
					System.out.println("Condition Address");
					filteredRestaurantDetails.add(restuarantDetailsTemp);	
				}	
			}
			filterRestaurantDetails.clear();
			filterRestaurantDetails.addAll(filteredRestaurantDetails);
			filteredRestaurantDetails.clear();
			if(filterRestaurantDetails.isEmpty()) { return filterRestaurantDetails;}
			
			}
			
		return filterRestaurantDetails;
	}
	
	}


