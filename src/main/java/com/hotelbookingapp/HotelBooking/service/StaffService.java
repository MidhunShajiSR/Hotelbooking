package com.hotelbookingapp.HotelBooking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotelbookingapp.HotelBooking.entity.Staff;
import com.hotelbookingapp.HotelBooking.repository.StaffRepository;

@Service
public class StaffService {

	@Autowired
	StaffRepository staffRepository;
	
	public List<Staff> getAllStaffs() {
		return staffRepository.findAll();
	}

	public Staff insertStaff(Staff staff) {
	
		return staffRepository.save(staff);
	}

	public Optional<Staff> getStaffById(Integer id) {
	
		return staffRepository.findById(id);
	}

	public Staff updateStaff(Staff staff, Integer id) {
	Staff stafftemp = getStaffById(id).get();
	stafftemp.setStaffName((staff.getStaffName().isEmpty())?stafftemp.getStaffName():staff.getStaffName());
	stafftemp.setPhoneNo((staff.getPhoneNo().isEmpty())?stafftemp.getPhoneNo():staff.getPhoneNo());
	stafftemp.setAddress((staff.getAddress().isEmpty())?stafftemp.getAddress():staff.getAddress());
	stafftemp.setIdProofType((staff.getIdProofType().isEmpty())?stafftemp.getIdProofType():staff.getIdProofType());
	stafftemp.setIdProofNo((staff.getIdProofNo().isEmpty())?stafftemp.getIdProofNo():staff.getIdProofNo());
	stafftemp.setUsername((staff.getUsername().isEmpty())?stafftemp.getUsername():staff.getUsername());
	stafftemp.setPassword((staff.getPassword().isEmpty())?stafftemp.getPassword():staff.getPassword());
	stafftemp.setGender((staff.getGender().isEmpty())?stafftemp.getGender():staff.getGender());
		return staffRepository.save(stafftemp);
	}

	public  String deleteStaffById(Integer id) {
		
		staffRepository.deleteById(id);
		return "Deleted Successfully";
	}

	public Staff loginStaff(String username, String password) {
		List<Staff> staffList = getAllStaffs();
		Staff staff = new Staff();
		for(Staff staffTemp :staffList)
				if(staffTemp.getUsername().equals(username) && staffTemp.getPassword().equals(password)) {
			staff = staffTemp;
		}
		return staff;
	}

	public List<Staff> filterStaff(Staff staff) {
	
		List<Staff> filterStaff = new ArrayList<Staff>();
		List<Staff> filteredStaff = new ArrayList<Staff>();
		List<Staff>staffList = getAllStaffs();
		
		if(!(staff.getStaffName().isEmpty())) {
			System.out.println("Condition Name");

			for(Staff staffTemp :staffList) {
				if(staff.getStaffName().equals(staffTemp.getStaffName())) {
					System.out.println("Condition Name");
					filteredStaff.add(staffTemp);
					
				}
				
			}
			filterStaff.clear();
			filterStaff.addAll(filteredStaff);
			if(filteredStaff.isEmpty()) {return filteredStaff;}
			filteredStaff.clear();
		}
			if(!(staff.getAddress().isEmpty())) {
				System.out.println("Condition Address");
				
			for(Staff staffTemp : (filterStaff.isEmpty())?staffList:filterStaff) {	
				if(staff.getAddress().equals(staffTemp.getAddress())) {
					System.out.println("Condition Address");
					filteredStaff.add(staffTemp);	
				}	
			}
			filterStaff.clear();
			filterStaff.addAll(filteredStaff);
			if(filteredStaff.isEmpty()) {return filteredStaff;}
			filteredStaff.clear();
			
			}
			if(!(staff.getPhoneNo().isEmpty())) {
				for(Staff staffTemp : (filterStaff.isEmpty())?staffList:filterStaff) 
				{
					
					if(staff.getPhoneNo().equals(staffTemp.getPhoneNo())) {
						filteredStaff.add(staffTemp);
					}
					
				}
				filterStaff.clear();
				filterStaff.addAll(filteredStaff);
				if(filteredStaff.isEmpty()) {return filteredStaff;}
				filteredStaff.clear();
			}
			
			if(!(staff.getIdProofType().isEmpty())) {
				for(Staff staffTemp : (filterStaff.isEmpty())?staffList:filterStaff) 
				{
					
					if(staff.getIdProofType().equals(staffTemp.getIdProofType())) {
						filteredStaff.add(staffTemp);
					}
					
				}
				filterStaff.clear();
				filterStaff.addAll(filteredStaff);
				if(filteredStaff.isEmpty()) {return filteredStaff;}
				filteredStaff.clear();
			}
			
			if(!(staff.getIdProofNo().isEmpty())) {
				for(Staff staffTemp : (filterStaff.isEmpty())?staffList:filterStaff) 
				{
					
					if(staff.getIdProofNo().equals(staffTemp.getIdProofNo())) {
						filteredStaff.add(staffTemp);
					}
					
				}
				filterStaff.clear();
				filterStaff.addAll(filteredStaff);
				if(filteredStaff.isEmpty()) {return filteredStaff;}
				filteredStaff.clear();
			}
			
			if(!(staff.getGender().isEmpty())) {
				for(Staff staffTemp : (filterStaff.isEmpty())?staffList:filterStaff) 
				{
					
					if(staff.getGender().equals(staffTemp.getGender())) {
						filteredStaff.add(staffTemp);
					}
					
				}
				filterStaff.clear();
				filterStaff.addAll(filteredStaff);
				if(filteredStaff.isEmpty()) {return filteredStaff;}
				filteredStaff.clear();
			}

			if(!(staff.getStatus().isEmpty())) {
				for(Staff staffTemp : (filterStaff.isEmpty())?staffList:filterStaff) 
				{
					
					if(staff.getStatus().equals(staffTemp.getStatus())) {
						filteredStaff.add(staffTemp);
					}
					
				}
				filterStaff.clear();
				filterStaff.addAll(filteredStaff);
				if(filteredStaff.isEmpty()) {return filteredStaff;}
				filteredStaff.clear();
			}

			return filterStaff;
	}
}


