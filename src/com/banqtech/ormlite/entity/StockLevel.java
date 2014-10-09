package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class StockLevel {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String location;
	@DatabaseField
	String product;
	@DatabaseField
	double stockSecurity;
	@DatabaseField
	double stockMaximum;
	
	public StockLevel() {
		// TODO Auto-generated constructor stub
	}

	public StockLevel(String id, String location, String product,
			double stockSecurity, double stockMaximum) {
		super();
		this.id = id;
		this.location = location;
		this.product = product;
		this.stockSecurity = stockSecurity;
		this.stockMaximum = stockMaximum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getStockSecurity() {
		return stockSecurity;
	}

	public void setStockSecurity(double stockSecurity) {
		this.stockSecurity = stockSecurity;
	}

	public double getStockMaximum() {
		return stockMaximum;
	}

	public void setStockMaximum(double stockMaximum) {
		this.stockMaximum = stockMaximum;
	}

	@Override
	public String toString() {
		return "StockLevel [id=" + id + ", location=" + location + ", product="
				+ product + ", stockSecurity=" + stockSecurity
				+ ", stockMaximum=" + stockMaximum + "]";
	}

}
