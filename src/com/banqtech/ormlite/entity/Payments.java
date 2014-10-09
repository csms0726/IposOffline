package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class Payments {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	int reciept;
	@DatabaseField
	String payment;
	@DatabaseField
	double total;
	
	public Payments() {
		// TODO Auto-generated constructor stub
	}

	public Payments(String id, int reciept, String payment, double total) {
		super();
		this.id = id;
		this.reciept = reciept;
		this.payment = payment;
		this.total = total;
	}

	@Override
	public String toString() {
		return "Payments [id=" + id + ", reciept=" + reciept + ", payment="
				+ payment + ", total=" + total + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getReciept() {
		return reciept;
	}

	public void setReciept(int reciept) {
		this.reciept = reciept;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
}
