package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class Consigner {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String name;
	@DatabaseField
	String notes;
	@DatabaseField
	String email;
	@DatabaseField
	String phone;
	@DatabaseField
	String phone2;
	@DatabaseField
	String fax;
	@DatabaseField
	String address;
	@DatabaseField
	String address2;
	@DatabaseField
	String postal;
	@DatabaseField
	String city;
	@DatabaseField
	String region;
	@DatabaseField
	String country;
	@DatabaseField
	int consignerCategories;
	
	public Consigner() {
		// TODO Auto-generated constructor stub
	}

	public Consigner(String id, String name, String notes, String email,
			String phone, String phone2, String fax, String address,
			String address2, String postal, String city, String region,
			String country, int consignerCategories) {
		super();
		this.id = id;
		this.name = name;
		this.notes = notes;
		this.email = email;
		this.phone = phone;
		this.phone2 = phone2;
		this.fax = fax;
		this.address = address;
		this.address2 = address2;
		this.postal = postal;
		this.city = city;
		this.region = region;
		this.country = country;
		this.consignerCategories = consignerCategories;
	}

	@Override
	public String toString() {
		return "Consigner [id=" + id + ", name=" + name + ", notes=" + notes
				+ ", email=" + email + ", phone=" + phone + ", phone2="
				+ phone2 + ", fax=" + fax + ", address=" + address
				+ ", address2=" + address2 + ", postal=" + postal + ", city="
				+ city + ", region=" + region + ", country=" + country
				+ ", consignerCategories=" + consignerCategories + "]";
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getConsignerCategories() {
		return consignerCategories;
	}

	public void setConsignerCategories(int consignerCategories) {
		this.consignerCategories = consignerCategories;
	}
	
}
