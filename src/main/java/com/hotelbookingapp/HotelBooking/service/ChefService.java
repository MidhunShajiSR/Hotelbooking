package com.hotelbookingapp.HotelBooking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelbookingapp.HotelBooking.entity.Chef;
import com.hotelbookingapp.HotelBooking.repository.ChefRepository;
@Service
public class ChefService {
	@Autowired
	 ChefRepository chefRepository;

	public List<Chef> getAllChefs() {
		
		return chefRepository.findAll();
	}

	public Chef insertChef(Chef chef) {
		
		return chefRepository.save(chef);
	}

	public Optional<Chef> getChefById(Integer id) {
		
		return chefRepository.findById(id);
	}

	public Chef updateChef(Chef chef, Integer id) {
		Chef cheftemp = getChefById(id).get();
		cheftemp.setChefName((chef.getChefName().isEmpty())?cheftemp.getChefName():chef.getChefName());
		cheftemp.setAddress((chef.getAddress().isEmpty())?cheftemp.getAddress():chef.getAddress());
		cheftemp.setPhoneNo((chef.getPhoneNo().isEmpty())?cheftemp.getPhoneNo():chef.getPhoneNo());
		cheftemp.setWorkExperience((chef.getWorkExperience().isEmpty())?cheftemp.getWorkExperience():chef.getWorkExperience());
		cheftemp.setUsername((chef.getUsername().isEmpty())?cheftemp.getUsername():chef.getUsername());
		cheftemp.setPassword((chef.getPassword().isEmpty())?cheftemp.getPassword():chef.getPassword());
		cheftemp.setGender((chef.getGender().isEmpty())?cheftemp.getGender():chef.getGender());


		return chefRepository.save(cheftemp);
	}

	public String deleteChefById(Integer id) {
		
		chefRepository.deleteById(id);
		return "Deleted Successfully";
	}

	public Chef loginChef(String username, String password) {
		List<Chef> chefList = getAllChefs();
		Chef chef = new Chef();
		for(Chef chefTemp : chefList) {
			if(chefTemp.getUsername().equals(username) && chefTemp.getPassword().equals(password))
				chef = chefTemp;
		}
	
		return chef;
	}

public List<Chef> filterChef(Chef chef) {
		
		
		List<Chef> filterChef = new ArrayList<Chef>();
		List<Chef> filteredChef = new ArrayList<Chef>();
		System.out.println("chef"+chef.getChefName());
		List<Chef>chefList = getAllChefs();
		
		if(!(chef.getChefName().isEmpty())) {
			System.out.println("Condition Name");

			for(Chef chefTemp :chefList) {
				if(chef.getChefName().equals(chefTemp.getChefName())) {
					System.out.println("Condition Name");
					filteredChef.add(chefTemp);
				}	
			}
			filterChef.clear();
			filterChef.addAll(filteredChef);
			filteredChef.clear();
			if(filterChef.isEmpty()) {return filterChef; }
		}

		if(!(chef.getAddress().isEmpty())){
				System.out.println("Condition Address");
				
			for(Chef chefTemp : (filteredChef.isEmpty())?chefList:filteredChef) {	
				if(chef.getAddress().equals(chefTemp.getAddress())) {
					System.out.println("Condition Address");
					filteredChef.add(chefTemp);	
				}	
			}
			filterChef.clear();
			filterChef.addAll(filteredChef);
			filteredChef.clear();
			if(filterChef.isEmpty()) {return filterChef; }
			
			}
			if(!(chef.getPhoneNo().isEmpty())) {
				for(Chef chefTemp : (filterChef.isEmpty())?chefList:filterChef) 
				{
					
					if(chef.getPhoneNo().equals(chefTemp.getPhoneNo())) {
						filteredChef.add(chefTemp);
					}
					
				}
				filterChef.clear();
				filterChef.addAll(filteredChef);
				filteredChef.clear();
				if(filterChef.isEmpty()) {return filterChef; }
			}
			if(!(chef.getWorkExperience().isEmpty())) {
				for(Chef chefTemp : (filterChef.isEmpty())?chefList:filterChef) {
					if(chef.getWorkExperience().equals(chefTemp.getWorkExperience())) {
						
						filteredChef.add(chefTemp);
					}
				}
				filterChef.clear();
				filterChef.addAll(filteredChef);
				filteredChef.clear();
				if(filterChef.isEmpty()) {return filterChef; }
			}
			if(!(chef.getUsername().isEmpty())) {
				for(Chef chefTemp : (filterChef.isEmpty())?chefList:filterChef) {
					if(chef.getUsername().equals(chefTemp.getUsername())) {
						
						filteredChef.add(chefTemp);
					}
				}
				filterChef.clear();
				filterChef.addAll(filteredChef);
				filteredChef.clear();
				if(filterChef.isEmpty()) {return filterChef; }
			}
			if(!(chef.getPassword().isEmpty())) {
				for(Chef chefTemp : (filterChef.isEmpty())?chefList:filterChef) {
					if(chef.getPassword().equals(chefTemp.getPassword())) {
						
						filteredChef.add(chefTemp);
					}
				}
				filterChef.clear();
				filterChef.addAll(filteredChef);
				filteredChef.clear();
				if(filterChef.isEmpty()) {return filterChef; }
			}
			if(!(chef.getGender().isEmpty())) {
				for(Chef chefTemp : (filterChef.isEmpty())?chefList:filterChef) {
					if(chef.getGender().equals(chefTemp.getGender())) {
						
						filteredChef.add(chefTemp);
					}
				}
				filterChef.clear();
				filterChef.addAll(filteredChef);
				filteredChef.clear();
				if(filterChef.isEmpty()) {return filterChef; }
			}
		return filterChef;
	}

	
}
