package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class Uom {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	@DatabaseField
	String symbol;
	public Uom() {
		// TODO Auto-generated constructor stub
	}
	public Uom(String id, String name, String symbol) {
		super();
		this.id = id;
		this.name = name;
		this.symbol = symbol;
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
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	@Override
	public String toString() {
		return "Uom [id=" + id + ", name=" + name + ", symbol=" + symbol + "]";
	}
	
}
