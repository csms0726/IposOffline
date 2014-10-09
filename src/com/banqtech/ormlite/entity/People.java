package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class People {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	@DatabaseField
	String apppassword;
	@DatabaseField
	String card;
	@DatabaseField
	String role;
	@DatabaseField
	boolean visible;
	@DatabaseField
	String image;
	
	public People() {
		// TODO Auto-generated constructor stub
	}

	public People(String id, String name, String apppassword, String card,
			String role, boolean visible, String image) {
		super();
		this.id = id;
		this.name = name;
		this.apppassword = apppassword;
		this.card = card;
		this.role = role;
		this.visible = visible;
		this.image = image;
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

	public String getApppassword() {
		return apppassword;
	}

	public void setApppassword(String apppassword) {
		this.apppassword = apppassword;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", apppassword="
				+ apppassword + ", card=" + card + ", role=" + role
				+ ", visible=" + visible + ", image=" + image + "]";
	}
}
