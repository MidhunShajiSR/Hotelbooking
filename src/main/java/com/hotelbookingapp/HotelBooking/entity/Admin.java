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
@Table(name="admin")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admin_id")
	private int adminId;
	@Column(name = "admin_name")
	private String adminName;
	private String address;
	@Column(name="phone_no")
	private String phoneNo;
	private String username;
	private String password;
	
	
	
	public Admin() {
		
	}
	public Admin(int adminId, String adminName, String address, String phoneNo, String username, String password) {
		
		this.adminId = adminId;
		this.adminName = adminName;
		this.address = address;
		this.phoneNo = phoneNo;
		this.username = username;
		this.password = password;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
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
	
	
	

}
