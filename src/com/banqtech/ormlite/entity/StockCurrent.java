package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class StockCurrent {
	@DatabaseField
	String location;
	@DatabaseField
	String product;
	@DatabaseField
	String attributeSetInstance_Id;
	@DatabaseField
	double units;
	
	public StockCurrent() {
		// TODO Auto-generated constructor stub
	}

	public StockCurrent(String location, String product,
			String attributeSetInstance_Id, double units) {
		super();
		this.location = location;
		this.product = product;
		this.attributeSetInstance_Id = attributeSetInstance_Id;
		this.units = units;
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

	public String getAttributeSetInstance_Id() {
		return attributeSetInstance_Id;
	}

	public void setAttributeSetInstance_Id(String attributeSetInstance_Id) {
		this.attributeSetInstance_Id = attributeSetInstance_Id;
	}

	public double getUnits() {
		return units;
	}

	public void setUnits(double units) {
		this.units = units;
	}

	@Override
	public String toString() {
		return "StockCurrent [location=" + location + ", product=" + product
				+ ", attributeSetInstance_Id=" + attributeSetInstance_Id
				+ ", units=" + units + "]";
	}
	
}
