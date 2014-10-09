package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class TicketsNumRefund {
	@DatabaseField
	int id;
	
	public TicketsNumRefund() {
		// TODO Auto-generated constructor stub
	}

	public TicketsNumRefund(int id) {
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
		return "TicketsNumRefund [id=" + id + "]";
	}
	
}
