package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class CustomerCategories {
	
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	@DatabaseField
	double discountRate;
	
	public CustomerCategories() {
		// TODO Auto-generated constructor stub
	}

	public CustomerCategories(String id, String name, double discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		return "CustomerCategories [id=" + id + ", name=" + name
				+ ", discountRate=" + discountRate + "]";
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

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}	
	
}
