package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class Places {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	@DatabaseField
	int x;
	@DatabaseField
	int y;
	@DatabaseField
	int floor;
	
	public Places() {
		// TODO Auto-generated constructor stub
	}

	public Places(String id, String name, int x, int y, int floor) {
		super();
		this.id = id;
		this.name = name;
		this.x = x;
		this.y = y;
		this.floor = floor;
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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return "Places [id=" + id + ", name=" + name + ", x=" + x + ", y=" + y
				+ ", floor=" + floor + "]";
	}
}
