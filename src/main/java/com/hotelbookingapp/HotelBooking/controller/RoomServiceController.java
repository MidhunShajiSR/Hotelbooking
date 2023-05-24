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

import com.hotelbookingapp.HotelBooking.entity.RentCalculate;
import com.hotelbookingapp.HotelBooking.entity.RoomDetails;
import com.hotelbookingapp.HotelBooking.entity.RoomServiceDetails;
import com.hotelbookingapp.HotelBooking.service.RoomServiceDetailsService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("hotelbooking")
public class RoomServiceController {

	@Autowired
	RoomServiceDetailsService roomServiceDetailsService;
	
	@GetMapping("/roomService")
	public List <RoomServiceDetails> getAllRooms(){
		
		return roomServiceDetailsService.getAllRoomServiceDetails();
		
	}
	
	@PostMapping("/roomBooking")
	public RoomServiceDetails insertRoom(@RequestBody RoomServiceDetails roomServiceDetails) {
		return roomServiceDetailsService.roomBooking(roomServiceDetails);
		
	}
	@GetMapping("/getroomServiceDetailsById/{id}")
	public Optional<RoomServiceDetails> getRoomServiceById(@PathVariable("id") Integer id) {
		return roomServiceDetailsService.getRoomServiceById(id);
		
	}
	
	@PutMapping("/updateroomServiceDetails/{id}")
	
	public RoomDetails updateRoomService(@RequestBody RoomServiceDetails roomServiceDetails, @PathVariable("id") Integer id) {
		return roomServiceDetailsService.updateRoomServiceDetails(roomServiceDetails, id);
		
	}
//	@DeleteMapping("deleteRoomService/{id}")
//	 public  String deleteRoom(@PathVariable("id") Integer id) {
//		return roomServiceDetailsService.deleteRoomServiceDetails(id);
//		 
//	 }
	@PostMapping("/calculateRent")
	public float calculateRent(@RequestBody RentCalculate rentCalculate) {
		return roomServiceDetailsService.calculateRent(rentCalculate);
	}

}

	
//}