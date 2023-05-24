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
@Table(name = "customer")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private int customerId;
	@Column(name = "customer_name")
	private String customerName;
	private String address;
	@Column(name = "phone_number")
	private String phoneNo;
	private String email;
	@Column(name = "id_proof_type")
	private String idProofType;
	@Column(name = "id_proof_no")
	private String idProofNo;
	private String gender;

	
	public Customer() {
		
	}

	public Customer(int customerId, String customerName, String address, String phoneNo, String email,
			String idProofType, String idProofNo , String gender) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
		this.idProofType = idProofType;
		this.idProofNo = idProofNo;
		this.gender = gender;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
