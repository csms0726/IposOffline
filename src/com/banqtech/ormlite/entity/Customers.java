package com.banqtech.ormlite.entity;

import com.j256.ormlite.field.DatabaseField;

public class Customers {
	@DatabaseField(id=true)
	String id;
	@DatabaseField
	String searchKey;
	@DatabaseField
	int taxid;
	@DatabaseField
	String name;
	@DatabaseField
	int taxCategory;
	@DatabaseField
	String card;
	@DatabaseField
	double maxDebt;
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
	String firstName;
	@DatabaseField
	String lastName;
	
	public Customers() {
		// TODO Auto-generated constructor stub
	}

	public Customers(String id, String searchKey, int taxid, String name,
			int taxCategory, String card, double maxDebt, String address,
			String address2, String postal, String city, String region,
			String country, String firstName, String lastName) {
		super();
		this.id = id;
		this.searchKey = searchKey;
		this.taxid = taxid;
		this.name = name;
		this.taxCategory = taxCategory;
		this.card = card;
		this.maxDebt = maxDebt;
		this.address = address;
		this.address2 = address2;
		this.postal = postal;
		this.city = city;
		this.region = region;
		this.country = country;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", searchKey=" + searchKey + ", taxid="
				+ taxid + ", name=" + name + ", taxCategory=" + taxCategory
				+ ", card=" + card + ", maxDebt=" + maxDebt + ", address="
				+ address + ", address2=" + address2 + ", postal=" + postal
				+ ", city=" + city + ", region=" + region + ", country="
				+ country + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public int getTaxid() {
		return taxid;
	}

	public void setTaxid(int taxid) {
		this.taxid = taxid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTaxCategory() {
		return taxCategory;
	}

	public void setTaxCategory(int taxCategory) {
		this.taxCategory = taxCategory;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public double getMaxDebt() {
		return maxDebt;
	}

	public void setMaxDebt(double maxDebt) {
		this.maxDebt = maxDebt;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
