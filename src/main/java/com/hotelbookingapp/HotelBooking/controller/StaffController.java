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

import com.hotelbookingapp.HotelBooking.entity.Staff;
import com.hotelbookingapp.HotelBooking.service.StaffService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("hotelbooking")
public class StaffController {
	@Autowired
	private StaffService staffService;
	@GetMapping("/Staffs")
	public List<Staff> getAllStaffs() {
		
		return staffService.getAllStaffs();
		
	}
	@PostMapping("/insertStaff")
	public Staff insertStaff(@RequestBody Staff Staff) {
		return staffService.insertStaff(Staff);
		
	}
	@GetMapping("/getStaffByid/{id}")
	public Optional<Staff> getStaffById(@PathVariable("id") Integer id) {
		return staffService.getStaffById(id);
		
	}
	
	@PutMapping("/updateStaff/{id}")
	public Staff update(@RequestBody Staff Staff, @PathVariable("id") Integer id) {
		return staffService.updateStaff(Staff, id);
		
	}
	@DeleteMapping("/deleteStaff/{id}")
	public String deleteStaffById(@PathVariable("id") Integer id) {
	return staffService.deleteStaffById(id);
		
	}
	@PostMapping("/loginStaff")
	public Staff loginStaff(@RequestParam("username") String username , @RequestParam("password")String password) {
		return staffService.loginStaff(username, password);
		
	}
	@PostMapping("/filterStaff")
	public List<Staff> filterStaff(@RequestBody Staff staff) {
		return staffService.filterStaff(staff);
		
		
	}

}
