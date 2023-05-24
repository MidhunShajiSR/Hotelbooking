package com.hotelbookingapp.HotelBooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbookingapp.HotelBooking.entity.Admin;
import com.hotelbookingapp.HotelBooking.entity.Customer;
import com.hotelbookingapp.HotelBooking.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	AdminRepository adminRepository;

	public List<Admin> getAllAdmins() {
		List<Admin> adminList = adminRepository.findAll();
		for(Admin admin: adminList) {
			System.out.println(admin.getAdminName());
			System.out.println(admin.getPhoneNo());
			
		}
		return adminList;
	}

	public Admin insertAdmin(Admin admin) {
		
		return adminRepository.save( admin);
		
	}

	public Optional<Admin> getAdminById(Integer id) {
		
		return adminRepository.findById(id);
	}

	public Admin updateAdmin(Admin admin , Integer id) {
		 
		 Admin admintemp = getAdminById(id).get();
		 admintemp.setAdminName((admin.getAdminName()==null)?admintemp.getAdminName():admin.getAdminName());
		 admintemp.setAddress((admin.getAddress()==null)?admintemp.getAddress():admin.getAddress());
		 admintemp.setPhoneNo((admin.getPhoneNo()==null)?admintemp.getPhoneNo():admin.getPhoneNo());
		 admintemp.setUsername((admin.getUsername()==null)?admintemp.getUsername():admin.getUsername());
		 admintemp.setPassword((admin.getPassword()==null)?admintemp.getPassword():admin.getPassword());
		return adminRepository.save(admintemp);
		
	}
	
	public String deleteAdmin(Integer id) {
		adminRepository.deleteById(id);
		return "Deleted Successfully";
		
	}

	public Admin loginAdmin(String username, String password) {
		List<Admin> adminList = getAllAdmins();
		Admin admin = new Admin();
		for(Admin adminTemp : adminList) {
			
			if(adminTemp.getUsername().equals(username) && adminTemp.getPassword().equals(password)) {
				admin= adminTemp;
			}
			
		}
		return admin;
		
	}
}
