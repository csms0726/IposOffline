package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class TaxLines {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String reciept;
	@DatabaseField
	String taxId;
	@DatabaseField
	double base;
	@DatabaseField
	double amount;
	
	public TaxLines() {
		// TODO Auto-generated constructor stub
	}

	public TaxLines(String id, String reciept, String taxId, double base,
			double amount) {
		super();
		this.id = id;
		this.reciept = reciept;
		this.taxId = taxId;
		this.base = base;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReciept() {
		return reciept;
	}

	public void setReciept(String reciept) {
		this.reciept = reciept;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "TaxLines [id=" + id + ", reciept=" + reciept + ", taxId="
				+ taxId + ", base=" + base + ", amount=" + amount + "]";
	}
	
}
