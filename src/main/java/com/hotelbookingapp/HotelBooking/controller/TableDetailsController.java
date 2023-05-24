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

import com.hotelbookingapp.HotelBooking.entity.TableDetails;
import com.hotelbookingapp.HotelBooking.service.TableDetailsService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("hotelbooking")
public class TableDetailsController {
	
	@Autowired
	TableDetailsService tableDetailsService;
	
	@GetMapping("/tableDetails")
	public List<TableDetails> getAllTableDetails() {
		
		return tableDetailsService.getAllTableDetails();
		
	}
	@PostMapping("/insertTableDetails")
	public TableDetails insertTableDetails(@RequestBody TableDetails tableDetails) {
		return tableDetailsService.insertTableDetails(tableDetails);
		
	}
	@GetMapping("/tableDetailsGetById/{id}")
	public Optional<TableDetails> getTableDetailsById(@PathVariable("id") Integer id) {
		return tableDetailsService.getTableDetailsById(id);
		
	}
	
	@PutMapping("/updateTableDetails/{id}")
	public TableDetails updateTableDetails(@RequestBody TableDetails tableDetails, @PathVariable("id") Integer id) {
		return tableDetailsService.updateTableDetails(tableDetails, id);
		
	}

	@DeleteMapping("/deleteTableDetails/{id}")
	public String deleteTableDetails(@PathVariable("id") Integer id) {
		return tableDetailsService.deleteTableDetails(id);
	}
	
	@GetMapping("/filterTableDetails") 
	public List<TableDetails> filterTableDetails(@RequestBody TableDetails tableDetails) {
		return tableDetailsService.filterTableDetails(tableDetails);
	}
	
	@GetMapping("/activeTable/{id}")
	public String activeTable(@PathVariable("id") Integer id) {
		return tableDetailsService.activeTable(id);
	}
	
	
	
	
	

}
