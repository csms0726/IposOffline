package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class ProductsBom {
	@DatabaseField(id=true)
	String product;
	@DatabaseField
	String material;
	@DatabaseField
	double amount;
	@DatabaseField
	double outpercent;
	
	public ProductsBom() {
		// TODO Auto-generated constructor stub
	}

	public ProductsBom(String product, String material, double amount,
			double outpercent) {
		super();
		this.product = product;
		this.material = material;
		this.amount = amount;
		this.outpercent = outpercent;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getOutpercent() {
		return outpercent;
	}

	public void setOutpercent(double outpercent) {
		this.outpercent = outpercent;
	}

	@Override
	public String toString() {
		return "ProductBom [product=" + product + ", material=" + material
				+ ", amount=" + amount + ", outpercent=" + outpercent + "]";
	}

}
