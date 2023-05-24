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

import com.hotelbookingapp.HotelBooking.entity.Customer;
import com.hotelbookingapp.HotelBooking.service.CustomerService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("hotelbooking")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		
		return customerService.getAllCustomers();
		
	}
	@PostMapping("/insertCustomer")
	public Customer insertCustomer(@RequestBody Customer customer) {
		
		return customerService.insertCustomer(customer);
		
	}
	@GetMapping("/customerGetById/{id}")
	public Optional<Customer> getCustomerById(@PathVariable("id") Integer id) {
		return customerService.getCustomerById(id);
		
	}
	
	@PutMapping("/updateCustomer/{id}")
	public Customer updateCustomer(@RequestBody Customer customer, @PathVariable("id") Integer id) {
		return customerService.updateCustomer(customer, id);
		
	}

	@DeleteMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable("id") Integer id) {
		return customerService.deleteCustomer(id);
	}
	
	@PostMapping("/filterCustomer") 
	public List<Customer> filterCustomer(@RequestBody Customer customer) {
		return customerService.filterCustomer(customer);
	}
	
}