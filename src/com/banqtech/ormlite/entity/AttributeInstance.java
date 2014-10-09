package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class AttributeInstance {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String attributeSetInstance_Id;
	@DatabaseField
	String attribute_Id;
	@DatabaseField
	String value;
	
	public AttributeInstance() {
		// TODO Auto-generated constructor stub
	}

	public AttributeInstance(String id, String attributeSetInstance_Id,
			String attribute_Id, String value) {
		super();
		this.id = id;
		this.attributeSetInstance_Id = attributeSetInstance_Id;
		this.attribute_Id = attribute_Id;
		this.value = value;
	}

	@Override
	public String toString() {
		return "AttributeInstance [id=" + id + ", attributeSetInstance_Id="
				+ attributeSetInstance_Id + ", attribute_Id=" + attribute_Id
				+ ", value=" + value + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttributeSetInstance_Id() {
		return attributeSetInstance_Id;
	}

	public void setAttributeSetInstance_Id(String attributeSetInstance_Id) {
		this.attributeSetInstance_Id = attributeSetInstance_Id;
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

}
