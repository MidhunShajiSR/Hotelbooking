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

import com.hotelbookingapp.HotelBooking.entity.Admin;
import com.hotelbookingapp.HotelBooking.entity.RoomDetails;
import com.hotelbookingapp.HotelBooking.service.RoomService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("hotelbooking")
public class RoomController {
	
	@Autowired
	private RoomService roomService;
	
	@GetMapping("/rooms")
	public List <RoomDetails> getAllRooms(){
		
		return roomService.getAllRooms();
		
	}
	
	@PostMapping("/insertRoom")
	public RoomDetails insertRoom(@RequestBody RoomDetails roomDetails) {
		return roomService.insertRoom(roomDetails);
		
	}
	@GetMapping("/getRoomById/{id}")
	public Optional<RoomDetails> getRoomById(@PathVariable("id") Integer id) {
		return roomService.getRoomById(id);
		
	}
	
	@PutMapping("/updateRoom/{id}")
	
	public RoomDetails updateRoom(@RequestBody RoomDetails roomDetails, @PathVariable("id") Integer id) {
		return roomService.updateRoom(roomDetails, id);
		
	}
	@DeleteMapping("/deleteRoom")
	 public  String deleteRoom(@PathVariable("id") Integer id) {
		return roomService.deleteRoom(id);
		 
	 }
	@GetMapping("/filterRooms" )
	public List<RoomDetails> filterRoom(@RequestBody RoomDetails roomDetails) {
		return roomService.filterRoom(roomDetails);
	}
	 

}
