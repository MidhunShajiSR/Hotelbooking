package com.hotelbookingapp.HotelBooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbookingapp.HotelBooking.entity.TableDetails;
import com.hotelbookingapp.HotelBooking.repository.TableDetailsRepository;

@Service
public class TableDetailsService {
	
	@Autowired
	TableDetailsRepository tableDetailsRepository;
	

	public List<TableDetails> getAllTableDetails() {
		
		return tableDetailsRepository.findAll();
	}

	public TableDetails insertTableDetails(TableDetails tableDetails) {
		
		return tableDetailsRepository.save(tableDetails);
	}

	public Optional<TableDetails> getTableDetailsById(Integer id) {

		return tableDetailsRepository.findById(id);
	}

	public TableDetails updateTableDetails(TableDetails tableDetails, Integer id) {

		return null;
	}

	public String deleteTableDetails(Integer id) {
		
		return null;
	}

	public List<TableDetails> filterTableDetails(TableDetails tableDetails) {

		return null;
	}
	
	public String activeTable(Integer id) {
		TableDetails tableDetails = getTableDetailsById(id).get();
		tableDetails.setTableStatus(true);
		tableDetailsRepository.save(tableDetails);
		return "Successfully Updated";
	}

	
	
	
}
