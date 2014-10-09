package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class TicketLines {
	@DatabaseField(id=true)
	String ticket;
	@DatabaseField
	int line;
	@DatabaseField
	String product;
	@DatabaseField
	String attributeSetInstance_Id;
	@DatabaseField
	double units;
	@DatabaseField
	double price;
	@DatabaseField
	String taxId;
	@DatabaseField
	double buy;
	@DatabaseField
	String attributes;
	@DatabaseField
	String billNo;
	@DatabaseField
	int side;
	
	public TicketLines() {
		// TODO Auto-generated constructor stub
	}

	public TicketLines(String ticket, int line, String product,
			String attributeSetInstance_Id, double units, double price,
			String taxId, double buy, String attributes, String billNo, int side) {
		super();
		this.ticket = ticket;
		this.line = line;
		this.product = product;
		this.attributeSetInstance_Id = attributeSetInstance_Id;
		this.units = units;
		this.price = price;
		this.taxId = taxId;
		this.buy = buy;
		this.attributes = attributes;
		this.billNo = billNo;
		this.side = side;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
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

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public double getBuy() {
		return buy;
	}

	public void setBuy(double buy) {
		this.buy = buy;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "TicketLines [ticket=" + ticket + ", line=" + line
				+ ", product=" + product + ", attributeSetInstance_Id="
				+ attributeSetInstance_Id + ", units=" + units + ", price="
				+ price + ", taxId=" + taxId + ", buy=" + buy + ", attributes="
				+ attributes + ", billNo=" + billNo + ", side=" + side + "]";
	}
}
