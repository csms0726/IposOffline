package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class Attribute {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	
	public Attribute() {
		// TODO Auto-generated constructor stub
	}

	public Attribute(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Attribute [id=" + id + ", name=" + name + "]";
	}
	
}
