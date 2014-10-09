package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class ProductsCom {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String product;
	@DatabaseField
	String product2;
	
	public ProductsCom() {
		// TODO Auto-generated constructor stub
	}

	public ProductsCom(String id, String product, String product2) {
		super();
		this.id = id;
		this.product = product;
		this.product2 = product2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getProduct2() {
		return product2;
	}

	public void setProduct2(String product2) {
		this.product2 = product2;
	}

	@Override
	public String toString() {
		return "ProductsCom [id=" + id + ", product=" + product + ", product2="
				+ product2 + "]";
	}
	

}
