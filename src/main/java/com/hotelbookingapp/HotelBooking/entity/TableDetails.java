package com.hotelbookingapp.HotelBooking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "table_details")
public class TableDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "table_id")
	private int tableId;
	@Column(name = "no_seat")
	private int numberOfSeat;
	@Column(name = "table_status")
	private boolean tableStatus;
	@Column(name = "table_rent")
	private int tableRent;
	
	public TableDetails() {
		super();
	}
	public TableDetails(int tableId, int numberOfSeat, boolean tableStatus, int tableRent) {
		super();
		this.tableId = tableId;
		this.numberOfSeat = numberOfSeat;
		this.tableStatus = tableStatus;
		this.tableRent = tableRent;
	}
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	public int getNumberOfSeat() {
		return numberOfSeat;
	}
	public void setNumberOfSeat(int numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}
	public boolean getTableStatus() {
		return tableStatus;
	}
	public void setTableStatus(boolean tableStatus) {
		this.tableStatus = tableStatus;
	}
	public int getTableRent() {
		return tableRent;
	}
	public void setTableRent(int tableRent) {
		this.tableRent = tableRent;
	}
	
	
	
	
	

}
