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

import com.hotelbookingapp.HotelBooking.entity.Admin;
import com.hotelbookingapp.HotelBooking.entity.Manager;
import com.hotelbookingapp.HotelBooking.service.ManagerService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("hotelbooking")
public class ManagerController  {
	
	@Autowired
	private ManagerService managerService;
	@GetMapping("/managers")
	public List<Manager> getAllManagers() {
		
		return managerService.getAllManagers();
		
	}
	@PostMapping("/insertManager")
	public Manager insertAdmin(@RequestBody Manager manager) {
		return managerService.insertManager(manager);
		
	}
	@GetMapping("/getManagerIyid/{id}")
	public Optional<Manager> getManagerById(@PathVariable("id") Integer id) {
		return managerService.getManagerById(id);
		
	}
	
	@PutMapping("/updateManager/{id}")
	public Manager update(@RequestBody Manager manager, @PathVariable("id") Integer id) {
		return managerService.updateManager(manager, id);
		
	}

	@DeleteMapping("/deleteManager/{id}")
	public String deleteManager(@PathVariable("id") Integer id)  {
		return managerService.deleteManager(id);
	}
//	@PostMapping("/loginManager")
//	public Manager loginManager(@RequestParam("username") String username, @RequestParam("password") String password) {
//		return managerService.loginManager(username , password);
//		
//	}
	@PostMapping("/loginManager")
	public Manager loginManager(@RequestParam("username") String username, @RequestParam("password") String password) {

		return managerService.loginManager(username , password);
		
	}

}
