package com.hotelbookingapp.HotelBooking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="manager")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "manager_id")
	private int managerId;
	@Column(name = "manager_name")
	private String managerName;
	private String address;
	@Column(name = "phone_no")
	private String phoneNo;
	private String email;
	private String username;
	private String password;
	private String gender;
	
	
	public Manager() {
		
	}
	public Manager(int managerId, String managerName, String address, String phoneNo, String email, String username,
			String password, String gender) {
		
		this.managerId = managerId;
		this.managerName = managerName;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
		this.username = username;
		this.password = password;
		this.gender = gender;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
