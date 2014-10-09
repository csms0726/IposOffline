package com.banqtech.ormlite.entity;

import java.util.Date;
import java.util.UUID;

import com.j256.ormlite.field.DatabaseField;

public class Applications {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	@DatabaseField
	String version;
	@DatabaseField
	Date date;
	public Applications() {
		// TODO Auto-generated constructor stub
	}
	
	public Applications(String id, String name, String version, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
		this.date = date;
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
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Applications [id=" + id + ", name=" + name + ", version="
				+ version + ", date=" + date + "]";
	}
	

}
