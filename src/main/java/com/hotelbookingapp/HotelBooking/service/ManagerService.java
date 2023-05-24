package com.hotelbookingapp.HotelBooking.service;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbookingapp.HotelBooking.entity.Admin;
import com.hotelbookingapp.HotelBooking.entity.Manager;
import com.hotelbookingapp.HotelBooking.repository.ManagerRepository;

@Service
public class ManagerService {

	
	@Autowired
	ManagerRepository managerRepository;
	

	public List<Manager> getAllManagers() {
		
		
		return managerRepository.findAll();
	}

	public Manager insertManager(Manager manager) {
		
		return  managerRepository.save( manager);
	}

	public Optional<Manager> getManagerById(Integer id) {
		
		return managerRepository.findById(id);
	}

	public Manager updateManager(Manager manager, Integer id) {
		 
		 Manager managertemp = getManagerById(id).get();
		 managertemp.setManagerName((manager.getManagerName().isEmpty())?managertemp.getManagerName():manager.getManagerName());
		 managertemp.setAddress((manager.getAddress().isEmpty())?managertemp.getAddress():manager.getAddress());
		 managertemp.setPhoneNo((manager.getPhoneNo().isEmpty())?managertemp.getPhoneNo():manager.getPhoneNo());
		 managertemp.setEmail((manager.getEmail().isEmpty())?managertemp.getEmail():manager.getEmail());
		 managertemp.setUsername((manager.getUsername().isEmpty())?managertemp.getUsername():manager.getUsername());
		 managertemp.setPassword((manager.getPassword().isEmpty())?managertemp.getPassword():manager.getPassword());
		 managertemp.setGender((manager.getGender().isEmpty())?managertemp.getGender():manager.getGender());
		return managerRepository.save(managertemp);
	}

	public String deleteManager(Integer id) {
		
		managerRepository.deleteById(id);
		return "Deleted Successfully";
	}

	public Manager loginManager(String username, String password) {
		
		List<Manager> managerList = managerRepository.findAll();	
		Manager manager = new Manager();
		for(Manager managerTemp : managerList) {
			System.out.println("hhhhh"+managerTemp.getUsername());
			System.out.println("hhhhh"+managerTemp.getPassword());
		if(	managerTemp.getUsername().equals(username) && managerTemp.getPassword().equals(password))
			manager = managerTemp;
		}
		return manager;
	}

	public List<Manager> filterManger(Manager manager) {
		
		
		List<Manager> filterManager = new ArrayList<Manager>();
		List<Manager> filteredManager = new ArrayList<Manager>();
		System.out.println("manager"+manager.getManagerName());
		List<Manager>managerList = getAllManagers();
		
		if(!(manager.getManagerName().isEmpty())) {
			System.out.println("Condition Name");

			for(Manager managerTemp :managerList) {
				if(manager.getManagerName().equals(managerTemp.getManagerName())) {
					System.out.println("Condition Name");
					filteredManager.add(managerTemp);
					
				}
				
			}
			filterManager.clear();
			filterManager.addAll(filteredManager);
			filteredManager.clear();
			if(filterManager.isEmpty()) {return filterManager;}
		}

//		if(!(manager.getAddress().isEmpty())){
//				System.out.println("Condition Address");
//				
//			for(Manager managerTemp : (filteredManager.isEmpty())?managerList:filteredManager) {	
//				if(manager.getAddress().equals(managerTemp.getAddress())) {
//					System.out.println("Condition Address");
//					filteredManager.add(managerTemp);	
//				}	
//			}
//			filterManager.clear();
//			filterManager.addAll(filteredManager);
//			filteredManager.clear();
//			if(filterManager.isEmpty()) {return filterManager;}
//			
//			}
		
			if(!(manager.getPhoneNo().isEmpty())) {
				for(Manager managerTemp : (filterManager.isEmpty())?managerList:filterManager) 
				{
					
					if(manager.getPhoneNo().equals(managerTemp.getPhoneNo())) {
						filteredManager.add(managerTemp);
					}
					
				}
				filterManager.clear();
				filterManager.addAll(filteredManager);
				filteredManager.clear();
				if(filterManager.isEmpty()) {return filterManager;}
			}
			if(!(manager.getEmail().isEmpty())) {
				for(Manager managerTemp : (filterManager.isEmpty())?managerList:filterManager) {
					if(manager.getEmail().equals(managerTemp.getEmail())) {
						
						filteredManager.add(managerTemp);
					}
				}
				filterManager.clear();
				filterManager.addAll(filteredManager);
				filteredManager.clear();
				if(filterManager.isEmpty()) {return filterManager;}
			}
			if(!(manager.getGender().isEmpty())) {
				for(Manager managerTemp : (filterManager.isEmpty())?managerList:filterManager) {
					if(manager.getGender().equals(managerTemp.getGender())) {
						
						filteredManager.add(managerTemp);
					}
				}
				filterManager.clear();
				filterManager.addAll(filteredManager);
				filteredManager.clear();
				if(filterManager.isEmpty()) {return filterManager;}
			}
		return filterManager;
	}
	
}
	
