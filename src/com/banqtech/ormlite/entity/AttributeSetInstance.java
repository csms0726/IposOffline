package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class AttributeSetInstance {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String attributeset_Id;
	@DatabaseField
	String description;
	
	public AttributeSetInstance() {
		// TODO Auto-generated constructor stub
	}

	public AttributeSetInstance(String id, String attributeset_Id,
			String description) {
		super();
		this.id = id;
		this.attributeset_Id = attributeset_Id;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttributeset_Id() {
		return attributeset_Id;
	}

	public void setAttributeset_Id(String attributeset_Id) {
		this.attributeset_Id = attributeset_Id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AttributeSetInstance [id=" + id + ", attributeset_Id="
				+ attributeset_Id + ", description=" + description + "]";
	}
}
