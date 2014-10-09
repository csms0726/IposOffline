package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class Roles {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	@DatabaseField
	String permissions;
	
	public Roles() {
		// TODO Auto-generated constructor stub
	}

	public Roles(String id, String name, String permissions) {
		super();
		this.id = id;
		this.name = name;
		this.permissions = permissions;
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

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}

	@Override
	public String toString() {
		return "Roles [id=" + id + ", name=" + name + ", permissions="
				+ permissions + "]";
	}
}
