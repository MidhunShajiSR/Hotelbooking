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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hotelbookingapp.HotelBooking.entity.Chef;
import com.hotelbookingapp.HotelBooking.entity.Manager;
import com.hotelbookingapp.HotelBooking.entity.Staff;
import com.hotelbookingapp.HotelBooking.service.ChefService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("hotelbooking")
public class ChefController {
	@Autowired
	private ChefService chefService;
	@GetMapping("/chefs")
	public List<Chef> getAllChefs() {
		
		return chefService.getAllChefs();
		
	}
	@PostMapping("/insertChef")
	public Chef insertChef(@RequestBody Chef chef) {
		return chefService.insertChef(chef);
		
	}
	@GetMapping("/getChefByid/{id}")
	public Optional<Chef> getChefById(@PathVariable("id") Integer id) {
		return chefService.getChefById(id);
		
	}
	
	@PutMapping("/updateChef/{id}")
	public Chef update(@RequestBody Chef chef, @PathVariable("id") Integer id) {
		return chefService.updateChef(chef, id);
		
	}
	@DeleteMapping("/deleteChef/{id}")
	public String deleteChefById(@PathVariable("id") Integer id) {
	return chefService.deleteChefById(id);
		
	}
	@PostMapping("/loginChef")
	public Chef loginChef(@RequestParam("username") String username ,@RequestParam("password")String password) {
		
		return chefService.loginChef(username , password);	
	}
	@PostMapping("/filterChef")
	public List<Chef> filterChef(@RequestBody Chef chef) {
		return chefService.filterChef(chef);
	}
	
}
