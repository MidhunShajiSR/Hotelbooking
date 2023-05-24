package com.hotelbookingapp.HotelBooking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="chef")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chef {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "chef_id")
		private int chefId;
		@Column(name = "chef_name")
		private String chefName;
		private String address;
		@Column(name = "phone_no")
		private String phoneNo;
		@Column(name="workexperience")
		private String workExperience;
		private String username;
		private String password;
		private String gender;
		
		
		public Chef() {
			
		}
		public Chef(int chefId, String chefName, String address, String phoneNo, String workExperience, String username,
				String password, String gender) {
			
			this.chefId = chefId;
			this.chefName = chefName;
			this.address = address;
			this.phoneNo = phoneNo;
			this.workExperience = workExperience;
			this.username = username;
			this.password = password;
			this.gender = gender;
		}
		public int getChefId() {
			return chefId;
		}
		public void setChefId(int chefId) {
			this.chefId = chefId;
		}
		public String getChefName() {
			return chefName;
		}
		public void setChefName(String chefName) {
			this.chefName = chefName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getWorkExperience() {
			return workExperience;
		}
		public void setWorkExperience(String workExperience) {
			this.workExperience = workExperience;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		
	
}
