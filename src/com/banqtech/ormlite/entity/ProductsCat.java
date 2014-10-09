package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class ProductsCat {
	@DatabaseField(id=true)
	String product;
	@DatabaseField
	int catOrder;
	
	public ProductsCat() {
		// TODO Auto-generated constructor stub
	}

	public ProductsCat(String product, int catOrder) {
		super();
		this.product = product;
		this.catOrder = catOrder;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getCatOrder() {
		return catOrder;
	}

	public void setCatOrder(int catOrder) {
		this.catOrder = catOrder;
	}

	@Override
	public String toString() {
		return "Productcat [product=" + product + ", catOrder=" + catOrder
				+ "]";
	}
	
}
