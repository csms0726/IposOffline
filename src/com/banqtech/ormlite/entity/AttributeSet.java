package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class AttributeSet {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	public AttributeSet() {
		// TODO Auto-generated constructor stub
	}
	public AttributeSet(String id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "AttributeSet [id=" + id + ", name=" + name + "]";
	}

}
