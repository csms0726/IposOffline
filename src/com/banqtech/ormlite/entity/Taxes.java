package com.banqtech.ormlite.entity;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;

public class Taxes {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	@DatabaseField
	Date validFrom;
	@DatabaseField
	String category;
	@DatabaseField
	String custCategory;
	@DatabaseField
	String parentId;
	@DatabaseField
	double rate;
	@DatabaseField
	boolean rateCascade;
	@DatabaseField
	boolean rateOrder;
	
	public Taxes() {
		// TODO Auto-generated constructor stub
	}

	public Taxes(String id, String name, Date validFrom, String category,
			String custCategory, String parentId, double rate,
			boolean rateCascade, boolean rateOrder) {
		super();
		this.id = id;
		this.name = name;
		this.validFrom = validFrom;
		this.category = category;
		this.custCategory = custCategory;
		this.parentId = parentId;
		this.rate = rate;
		this.rateCascade = rateCascade;
		this.rateOrder = rateOrder;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCustCategory() {
		return custCategory;
	}

	public void setCustCategory(String custCategory) {
		this.custCategory = custCategory;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public boolean isRateCascade() {
		return rateCascade;
	}

	public void setRateCascade(boolean rateCascade) {
		this.rateCascade = rateCascade;
	}

	public boolean isRateOrder() {
		return rateOrder;
	}

	public void setRateOrder(boolean rateOrder) {
		this.rateOrder = rateOrder;
	}

	@Override
	public String toString() {
		return "Taxes [id=" + id + ", name=" + name + ", validFrom="
				+ validFrom + ", category=" + category + ", custCategory="
				+ custCategory + ", parentId=" + parentId + ", rate=" + rate
				+ ", rateCascade=" + rateCascade + ", rateOrder=" + rateOrder
				+ "]";
	}
	
}
