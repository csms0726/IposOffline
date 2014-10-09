package com.banqtech.ormlite.entity;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;

public class Reciepts {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String money;
	@DatabaseField
	Date datenew;
	@DatabaseField
	String attributes;
	@DatabaseField
	int side;
	
	public Reciepts() {
		// TODO Auto-generated constructor stub
	}

	public Reciepts(String id, String money, Date datenew, String attributes,
			int side) {
		super();
		this.id = id;
		this.money = money;
		this.datenew = datenew;
		this.attributes = attributes;
		this.side = side;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public Date getDatenew() {
		return datenew;
	}

	public void setDatenew(Date datenew) {
		this.datenew = datenew;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "Reciepts [id=" + id + ", money=" + money + ", datenew="
				+ datenew + ", attributes=" + attributes + ", side=" + side
				+ "]";
	}
	
}
