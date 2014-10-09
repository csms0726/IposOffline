package com.banqtech.ormlite.entity;

import java.util.Date;

import com.j256.ormlite.field.DatabaseField;

public class Reservations {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	Date created;
	@DatabaseField
	Date datenew;
	@DatabaseField
	String title;
	@DatabaseField
	int chairs;
	@DatabaseField
	boolean isDone;
	@DatabaseField
	String description;
	
	public Reservations() {
		// TODO Auto-generated constructor stub
	}

	public Reservations(String id, Date created, Date datenew, String title,
			int chairs, boolean isDone, String description) {
		super();
		this.id = id;
		this.created = created;
		this.datenew = datenew;
		this.title = title;
		this.chairs = chairs;
		this.isDone = isDone;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getDatenew() {
		return datenew;
	}

	public void setDatenew(Date datenew) {
		this.datenew = datenew;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getChairs() {
		return chairs;
	}

	public void setChairs(int chairs) {
		this.chairs = chairs;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Reservations [id=" + id + ", created=" + created + ", datenew="
				+ datenew + ", title=" + title + ", chairs=" + chairs
				+ ", isDone=" + isDone + ", description=" + description + "]";
	}
	
}
