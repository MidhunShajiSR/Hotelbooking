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
@Table(name="staff")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "staff_id")
	private int staffId;
	@Column(name = "staff_name")
	private String staffName;
	@Column(name = "phone_no")
	private String phoneNo;
	private String address;
	@Column(name = "id_proof_type")
	private String idProofType;
	@Column(name = "id_proof_no")
	private String idProofNo;
	private String username;
	private String password;
	private String gender;
	private String status;
	
	
	public Staff() {
	
	}
	public Staff(int staffId, String staffName, String phoneNo, String address, String idProofType, String idProofNo,
			String username, String password, String gender, String status) {
	
		this.staffId = staffId;
		this.staffName = staffName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.idProofType = idProofType;
		this.idProofNo = idProofNo;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.status = status;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdProofType() {
		return idProofType;
	}
	public void setIdProofType(String idProofType) {
		this.idProofType = idProofType;
	}
	public String getIdProofNo() {
		return idProofNo;
	}
	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
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
	public String getStatus() {
		return status;
	}
	public void setStaus(String status) {
		this.status = status;
	}
	
	
	
}