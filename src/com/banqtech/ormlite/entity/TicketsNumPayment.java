package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class TicketsNumPayment {
	@DatabaseField
	int id;
	
	public TicketsNumPayment() {
		// TODO Auto-generated constructor stub
	}

	public TicketsNumPayment(int id) {
		super();
		this.id = id;
	} 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TicketsNumPayment [id=" + id + "]";
	}
	
	
}
