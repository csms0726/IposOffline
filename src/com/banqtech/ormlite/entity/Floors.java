package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class Floors {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	@DatabaseField
	String image;
	
	public Floors() {
		// TODO Auto-generated constructor stub
	}

	public Floors(String id, String name, String image) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
	}

	@Override
	public String toString() {
		return "Floors [id=" + id + ", name=" + name + ", image=" + image + "]";
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
}
