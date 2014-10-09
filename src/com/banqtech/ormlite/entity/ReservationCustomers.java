package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class ReservationCustomers {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String customer;
	
	public ReservationCustomers() {
		// TODO Auto-generated constructor stub
	}

	public ReservationCustomers(String id, String customer) {
		super();
		this.id = id;
		this.customer = customer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "ReservationCustomers [id=" + id + ", customer=" + customer
				+ "]";
	}
	
}
