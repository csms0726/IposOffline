package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class Categories {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	@DatabaseField
	int parentid;
	@DatabaseField
	String image;
	
	public Categories() {
		
	}

	public Categories(String id, String name, int parentid, String image) {
		super();
		this.id = id;
		this.name = name;
		this.parentid = parentid;
		this.image = image;
	}

	@Override
	public String toString() {
		return "Categories [id=" + id + ", name=" + name + ", parentid="
				+ parentid + ", image=" + image + "]";
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

	public int getParentid() {
		return parentid;
	}

	public void setParentid(int parentid) {
		this.parentid = parentid;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}
