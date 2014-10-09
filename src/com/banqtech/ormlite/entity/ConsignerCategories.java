package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class ConsignerCategories {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	@DatabaseField
	double discountRate;
	
	public ConsignerCategories() {
		// TODO Auto-generated constructor stub
	}

	public ConsignerCategories(String id, String name, double discountRate) {
		super();
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		return "ConsignerCategories [id=" + id + ", name=" + name
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
