package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class AttributeValue {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String attribute_Id;
	@DatabaseField
	String value;
	
	public AttributeValue() {
		// TODO Auto-generated constructor stub
	}

	public AttributeValue(String id, String attribute_Id, String value) {
		super();
		this.id = id;
		this.attribute_Id = attribute_Id;
		this.value = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttribute_Id() {
		return attribute_Id;
	}

	public void setAttribute_Id(String attribute_Id) {
		this.attribute_Id = attribute_Id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "AttributeValue [id=" + id + ", attribute_Id=" + attribute_Id
				+ ", value=" + value + "]";
	}
}
