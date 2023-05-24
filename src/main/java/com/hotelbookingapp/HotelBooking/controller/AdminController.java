package com.hotelbookingapp.HotelBooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
import com.hotelbookingapp.HotelBooking.service.AdminService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("hotelbooking")
public class AdminController {
	@Autowired
	private AdminService adminService;
	@GetMapping("/admins")
	public List<Admin> getAllAdmins() {
		
		return adminService.getAllAdmins();
		
	}
	@PostMapping("/insertAdmin")
	public Admin insertAdmin(@RequestBody Admin admin) {
		return adminService.insertAdmin(admin);
		
	}
	@GetMapping("/getById/{id}")
	public Optional<Admin> getAdminById(@PathVariable("id") Integer id) {
		return adminService.getAdminById(id);
		
	}
	
	@PutMapping("/updateAdmin/{id}")
	
	public Admin update(@RequestBody Admin admin, @PathVariable("id") Integer id) {
		return adminService.updateAdmin(admin, id);
		
	}
	
	@DeleteMapping("/deleteAdmin/{id}")
	
	public String deleteAdmin(@PathVariable("id") Integer id) {
		return adminService.deleteAdmin(id);
		 
	}
	@PostMapping("/loginAdmin")
	public Admin loginAdmin(@RequestParam("username") String username, @RequestParam("password") String password) {

		return adminService.loginAdmin(username , password);
		
	}



}
