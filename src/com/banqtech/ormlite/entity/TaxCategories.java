package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class TaxCategories {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	
	public TaxCategories() {
		// TODO Auto-generated constructor stub
	}

	public TaxCategories(String id, String name) {
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
		return "TaxCategories [id=" + id + ", name=" + name + "]";
	}
	
	
}
