package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class TicketsNum {
	@DatabaseField
	int id;
	
	public TicketsNum() {
		// TODO Auto-generated constructor stub
	}

	public TicketsNum(int id) {
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
		return "TicketsNum [id=" + id + "]";
	}
	
}
