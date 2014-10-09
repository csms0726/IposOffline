package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class SharedTickets {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	@DatabaseField
	String content;
	
	public SharedTickets() {
		// TODO Auto-generated constructor stub
	}

	public SharedTickets(String id, String name, String content) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "SharedTickets [id=" + id + ", name=" + name + ", content="
				+ content + "]";
	}
	
}
