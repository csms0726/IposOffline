package com.banqtech.ormlite.entity;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;

public class StockDiary {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	Date dateNew;
	@DatabaseField
	int reason;
	@DatabaseField
	String location;
	@DatabaseField
	String product;
	@DatabaseField
	String attributeSetInstance_Id;
	@DatabaseField
	double units;
	@DatabaseField
	double price;
	@DatabaseField
	String consigners;
	@DatabaseField
	int side;
	public StockDiary() {
		// TODO Auto-generated constructor stub
	}
	public StockDiary(String id, Date dateNew, int reason, String location,
			String product, String attributeSetInstance_Id, double units,
			double price, String consigners, int side) {
		super();
		this.id = id;
		this.dateNew = dateNew;
		this.reason = reason;
		this.location = location;
		this.product = product;
		this.attributeSetInstance_Id = attributeSetInstance_Id;
		this.units = units;
		this.price = price;
		this.consigners = consigners;
		this.side = side;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDateNew() {
		return dateNew;
	}
	public void setDateNew(Date dateNew) {
		this.dateNew = dateNew;
	}
	public int getReason() {
		return reason;
	}
	public void setReason(int reason) {
		this.reason = reason;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getConsigners() {
		return consigners;
	}
	public void setConsigners(String consigners) {
		this.consigners = consigners;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	@Override
	public String toString() {
		return "StockDiary [id=" + id + ", dateNew=" + dateNew + ", reason="
				+ reason + ", location=" + location + ", product=" + product
				+ ", attributeSetInstance_Id=" + attributeSetInstance_Id
				+ ", units=" + units + ", price=" + price + ", consigners="
				+ consigners + ", side=" + side + "]";
	}
}
