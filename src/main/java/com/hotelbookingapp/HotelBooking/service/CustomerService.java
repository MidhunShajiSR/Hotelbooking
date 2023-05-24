package com.hotelbookingapp.HotelBooking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbookingapp.HotelBooking.entity.Chef;
import com.hotelbookingapp.HotelBooking.entity.Customer;
import com.hotelbookingapp.HotelBooking.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {

		List<Customer> customerList = customerRepository.findAll();
		for(Customer customer: customerList) {
			System.out.println(customer.getCustomerName());
		}
		return customerList;
		
	}

	public Customer insertCustomer(Customer customer) {
		System.out.println("address***"+customer.getAddress());
				
		return customerRepository.save( customer);
	}

	public Optional<Customer> getCustomerById(Integer id) {
		
		
		return customerRepository.findById(id);
	}

	public Customer updateCustomer(Customer customer , Integer id) {
		
	Customer updatecustomer = getCustomerById(id).get();
	System.out.println(("Update Customer:"+updatecustomer.getGender()));

	updatecustomer.setCustomerName((customer.getCustomerName().isEmpty())?updatecustomer.getCustomerName():customer.getCustomerName());
	updatecustomer.setAddress((customer.getAddress().isEmpty())?updatecustomer.getAddress():customer.getAddress());
	updatecustomer.setEmail((customer.getEmail().isEmpty())?updatecustomer.getEmail():customer.getEmail());
	updatecustomer.setPhoneNo((customer.getPhoneNo().isEmpty())?updatecustomer.getPhoneNo():customer.getPhoneNo());
	updatecustomer.setIdProofType((customer.getIdProofType().isEmpty())?updatecustomer.getIdProofType():customer.getIdProofType());
	updatecustomer.setIdProofNo((customer.getIdProofNo().isEmpty())?updatecustomer.getIdProofNo():customer.getIdProofNo());
	updatecustomer.setGender((customer.getGender().isEmpty())?updatecustomer.getGender():customer.getGender());
	System.out.println("Customer Gender:"+customer.getGender());
		 return customerRepository.save(updatecustomer);
	}

	public String deleteCustomer(Integer id) {
		
		customerRepository.deleteById(id);
		return "Deleted Successfully";
	}

	public List<Customer> filterCustomer(Customer customer) {

		
		List<Customer> filterCustomer = new ArrayList<Customer>();
		List<Customer> filteredCustomer = new ArrayList<Customer>();
		System.out.println("customer"+customer.getCustomerName());
		List<Customer>customerList = getAllCustomers();
		
		if(!(customer.getCustomerName().isEmpty())) {
			System.out.println("Condition Name");

			for(Customer customerTemp :customerList) {
				if(customer.getCustomerName().equals(customerTemp.getCustomerName())) {
					System.out.println("Condition Name");
					filteredCustomer.add(customerTemp);
				}	
			}
			filterCustomer.clear();
			filterCustomer.addAll(filteredCustomer);
			filteredCustomer.clear();
			if(filterCustomer.isEmpty()) { return filterCustomer;}
		}

		if(!(customer.getAddress().isEmpty())){
				System.out.println("Condition Address");
				
			for(Customer customerTemp : (filterCustomer.isEmpty())?customerList:filterCustomer) {	
				if(customer.getAddress().equals(customerTemp.getAddress())) {
					System.out.println("Condition Address");
					filteredCustomer.add(customerTemp);	
				}	
			}
			filterCustomer.clear();
			filterCustomer.addAll(filteredCustomer);
			filteredCustomer.clear();
			if(filterCustomer.isEmpty()) { return filterCustomer;}
			
			}
			if(!(customer.getPhoneNo().isEmpty())) {
				for(Customer customerTemp : (filterCustomer.isEmpty())?customerList:filterCustomer) 
				{
					
					if(customer.getPhoneNo().equals(customerTemp.getPhoneNo())) {
						filteredCustomer.add(customerTemp);
					}
					
				}
				filterCustomer.clear();
				filterCustomer.addAll(filteredCustomer);
				filteredCustomer.clear();
				if(filterCustomer.isEmpty()) { return filterCustomer;}
			}
			if(!(customer.getEmail().isEmpty())) {
				for(Customer customerTemp : (filterCustomer.isEmpty())?customerList:filterCustomer) {
					if(customer.getEmail().equals(customerTemp.getEmail())) {
						
						filteredCustomer.add(customerTemp);
					}
				}
				filterCustomer.clear();
				filterCustomer.addAll(filteredCustomer);
				filteredCustomer.clear();
				if(filterCustomer.isEmpty()) { return filterCustomer;}
			}
			if(!(customer.getIdProofType().isEmpty())) {
				for(Customer customerTemp : (filterCustomer.isEmpty())?customerList:filterCustomer) {
					if(customer.getIdProofType().equals(customerTemp.getIdProofType())) {
						
						filteredCustomer.add(customerTemp);
					}
				}
				filterCustomer.clear();
				filterCustomer.addAll(filteredCustomer);
				filteredCustomer.clear();
				if(filterCustomer.isEmpty()) { return filterCustomer;}
			}
			if(!(customer.getIdProofNo().isEmpty())) {
				for(Customer customerTemp : (filterCustomer.isEmpty())?customerList:filterCustomer) {
					if(customer.getIdProofNo().equals(customerTemp.getIdProofNo())) {
						
						filteredCustomer.add(customerTemp);
					}
				}
				filterCustomer.clear();
				filterCustomer.addAll(filteredCustomer);
				filteredCustomer.clear();
				if(filterCustomer.isEmpty()) { return filterCustomer;}
			}
			if(!(customer.getGender().isEmpty())) {
				for(Customer customerTemp : (filterCustomer.isEmpty())?customerList:filterCustomer) {
					if(customer.getGender().equals(customerTemp.getGender())) {
						
						filteredCustomer.add(customerTemp);
					}
				}
				filterCustomer.clear();
				filterCustomer.addAll(filteredCustomer);
				filteredCustomer.clear();
				if(filterCustomer.isEmpty()) { return filterCustomer;}
			}
		return filterCustomer;
	}
	
	

}
