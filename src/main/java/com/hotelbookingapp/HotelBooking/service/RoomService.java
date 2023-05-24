package com.hotelbookingapp.HotelBooking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbookingapp.HotelBooking.entity.Manager;
import com.hotelbookingapp.HotelBooking.entity.RoomDetails;
import com.hotelbookingapp.HotelBooking.entity.Staff;
import com.hotelbookingapp.HotelBooking.repository.RoomRepository;

@Service
public class RoomService {
	@Autowired
	RoomRepository roomRepository;
	
	public List<RoomDetails> getAllRooms() {
	
		return roomRepository.findAll();
	}

	public RoomDetails insertRoom(RoomDetails roomDetails) {
		roomDetails.setStatus(true);
		return roomRepository.save(roomDetails);
	}

	public Optional<RoomDetails> getRoomById(Integer id) {
	
		return roomRepository.findById(id);
	}

	public RoomDetails updateRoom(RoomDetails roomDetails, Integer id) {
		roomDetails.setStatus(true);
		RoomDetails roomtemp = getRoomById(id).get();
		roomtemp.setRoomCategory((roomDetails.getRoomCategory()==null)?roomtemp.getRoomCategory():roomDetails.getRoomCategory());
		roomtemp.setRoomType((roomDetails.getRoomType()==null)?roomtemp.getRoomType():roomDetails.getRoomType());
		roomtemp.setRent((roomDetails.getRent()==0)?roomtemp.getRent():roomDetails.getRent());
		roomtemp.setPaymentMode((roomDetails.getPaymentMode()==null)?roomtemp.getPaymentMode():roomDetails.getPaymentMode());
		
			return roomRepository.save(roomtemp);
	
	}

	public String  deleteRoom(Integer id) {
		
		
		 roomRepository.deleteById(id);
		 return "Deleted Successfully";
	}

	public List<RoomDetails> filterRoom(RoomDetails roomDetails) {
		
		List<RoomDetails> filterRoomDetails = new ArrayList<RoomDetails>();
		List<RoomDetails> filteredRoomDetails= new ArrayList<RoomDetails>();
		System.out.println("roomDetails"+roomDetails.getRoomCategory());
		List<RoomDetails>roomDetailsList = getAllRooms();
		
		if(!(roomDetails.getRoomCategory()).isEmpty()) {
			
			System.out.println("Condition Name");

			for(RoomDetails roomDetailsTemp :roomDetailsList) {
				if(roomDetails.getRoomCategory().equals(roomDetailsTemp.getRoomCategory())) {
					System.out.println("Condition Name");
					filteredRoomDetails.add(roomDetailsTemp);
					
				}
				
			}
			filterRoomDetails.clear();
			filterRoomDetails.addAll(filteredRoomDetails);
			filteredRoomDetails.clear();
			if(filterRoomDetails.isEmpty()) { return filterRoomDetails;}
		}

		if(!(roomDetails.getRoomType().isEmpty())){
				System.out.println("Condition Address");
				
			for(RoomDetails roomDetailsTemp : (filteredRoomDetails.isEmpty())?roomDetailsList:filteredRoomDetails) {	
				if(roomDetails.getRoomType().equals(roomDetailsTemp.getRoomType())) {
					System.out.println("Condition Address");
					filteredRoomDetails.add(roomDetailsTemp);	
				}	
			}
			filterRoomDetails.clear();
			filterRoomDetails.addAll(filteredRoomDetails);
			filteredRoomDetails.clear();
			if(filterRoomDetails.isEmpty()) { return filterRoomDetails;}
			
			}
			if(!(roomDetails.getRent()==0)) {
				for(RoomDetails roomDetailsTemp : (filterRoomDetails.isEmpty())?roomDetailsList:filterRoomDetails) 
				{
					
					if(roomDetails.getRent() == (roomDetailsTemp.getRent())) {
						filteredRoomDetails.add(roomDetailsTemp);
					}
					
				}
				filterRoomDetails.clear();
				filterRoomDetails.addAll(filteredRoomDetails);
				filteredRoomDetails.clear();
				if(filterRoomDetails.isEmpty()) { return filterRoomDetails;}
			}
			if(!(roomDetails.getPaymentMode().isEmpty())) {
				for(RoomDetails roomDetailsTemp : (filterRoomDetails.isEmpty())?roomDetailsList:filterRoomDetails) {
					if(roomDetails.getPaymentMode().equals(roomDetailsTemp.getPaymentMode())) {
						
						filteredRoomDetails.add(roomDetailsTemp);
					}
				}
				filterRoomDetails.clear();
				filterRoomDetails.addAll(filteredRoomDetails);
				filteredRoomDetails.clear();
				if(filterRoomDetails.isEmpty()) { return filterRoomDetails;}
			}
			
			
		return filterRoomDetails;
	}
	}
	


